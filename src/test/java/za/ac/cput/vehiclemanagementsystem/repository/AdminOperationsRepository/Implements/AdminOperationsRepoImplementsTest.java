package za.ac.cput.vehiclemanagementsystem.repository.AdminOperationsRepository.Implements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Admin;
import za.ac.cput.vehiclemanagementsystem.Factory.AdminoperationsFactory.AdminOperationFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository.AdminOperationsRepository;
//import za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository.Implements.AdminOperationsRepoImplements;

import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AdminOperationsRepoImplementsTest {
/*
    private AdminOperationsRepository repository;
    private AdminOperations adminOperations;

    private AdminOperations getSavedOperations()
    {
        List <AdminOperations> savedOperations = this.repository.findAll();
        return savedOperations.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = AdminOperationsRepoImplements.getRepository();
        this.adminOperations = AdminOperationFactory.getOperation("TY234X", "Managing a fleet of Vehicles");
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void findAll() {
        /*
        Set<Student> students = this.repository.getAll();
        Assert.assertEquals(1, students.size());
         */
 /*       List<AdminOperations> adminList = this.repository.findAll();
        Assert.assertEquals(1, adminList.size());
    }

    @Test
    public void create() {
        adminOperations = this.repository.create(this.adminOperations);
        System.out.println("Creating Operation... " + adminOperations);
        findAll();
        //this.repository.create(null);
        Assert.assertSame(adminOperations, this.adminOperations);
    }

    @Test
    public void read()
    {
        AdminOperations savedOperations = getSavedOperations();
        System.out.println("Reading Admin Operation... " + adminOperations.getOperationID());
        AdminOperations read = this.repository.read(savedOperations.getOperationID());
        findAll();
        Assert.assertNotEquals(savedOperations, read);
    }

    @Test
    public void update()
    {
        String newOperation = "New Admin Test Operation";
        AdminOperations operations = new AdminOperations.Builder().copy(getSavedOperations()).operation(newOperation).build();
        System.out.println("On Update... " + operations);
        Assert.assertNotEquals(newOperation, operations);
        findAll();
    }

    @Test
    public void delete()
    {
        AdminOperations toDelete = getSavedOperations();
        this.repository.delete(toDelete.getOperationID());
        findAll();
    }
    */
}