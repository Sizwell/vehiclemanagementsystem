package za.ac.cput.vehiclemanagementsystem.repository.Implements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository;
import za.ac.cput.vehiclemanagementsystem.Repository.Implements.AdminOperationsRepoImplements;

import java.util.List;

import static org.junit.Assert.*;

public class AdminOperationsRepoImplementsTest {

    private AdminOperationsRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = AdminOperationsRepoImplements.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void findAll()
    {
        /*
        Set<Student> students = this.repository.getAll();
        Assert.assertEquals(1, students.size());
         */
        List <AdminOperations> adminList = this.repository.findAll();
        Assert.assertEquals(1, adminList.size());
    }

    @Test
    public void create()
    {
        this.repository.create(null);
        Assert.assertEquals("Odwa", "Odwa");
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}