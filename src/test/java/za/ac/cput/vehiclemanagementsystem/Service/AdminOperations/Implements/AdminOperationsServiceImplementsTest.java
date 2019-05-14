package za.ac.cput.vehiclemanagementsystem.Service.AdminOperations.Implements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Admin;
import za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository.Implements.AdminOperationsRepoImplements;

import java.util.List;

import static org.junit.Assert.*;

public class AdminOperationsServiceImplementsTest {


    AdminOperationsRepoImplements repository;
    AdminOperations adminOperations;


    @Before
    public void setUp() throws Exception
    {
        this.repository = AdminOperationsRepoImplements.getRepository();

    }

    public AdminOperations getSaved()
    {
        return this.repository.findAll().iterator().next();
    }

    @Test
    public void getAdminOperations()
    {
        List <AdminOperations> adminOperationsList = this.repository.findAll();
        System.out.println("Getting All: " + adminOperationsList);
    }

    @Test
    public void findAll() {
    }

    @Test
    public void create()
    {
        AdminOperations created = this.repository.create(this.adminOperations);
        System.out.println("Creating Admin Operations: " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.adminOperations);
    }

    @Test
    public void read()
    {
       AdminOperations saved = getSaved();
        AdminOperations read = this.repository.read(saved.getOperationID());
        AdminOperations read2 = this.repository.read(saved.getOperation());
        Assert.assertSame(read, saved);
    }

    @Test
    public void update()
    {
        String newOperation = "Manage Tour";
        AdminOperations updater = new AdminOperations.Builder().copy(getSaved()).operation(newOperation).build();
        System.out.println("Updating... " + updater);
        this.repository.update(updater);
        Assert.assertSame(newOperation, updater.getOperation());
    }

    @Test
    public void delete()
    {
        AdminOperations saved = getSaved();
        this.repository.delete(saved.getOperationID());
        getAdminOperations();
    }
}