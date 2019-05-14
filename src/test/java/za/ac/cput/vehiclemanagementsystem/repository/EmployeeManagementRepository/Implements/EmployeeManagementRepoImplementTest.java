package za.ac.cput.vehiclemanagementsystem.repository.EmployeeManagementRepository.Implements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.w3c.dom.stylesheets.LinkStyle;
import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Employee;
import za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement.EmployeeManagement;
import za.ac.cput.vehiclemanagementsystem.Factory.EmployeeManagementFactory.EmployeeManagementFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeManagementRepository.EmployeeManagementRepository;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeManagementRepository.Implements.EmployeeManagementRepoImplement;

import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeManagementRepoImplementTest {

   private EmployeeManagementRepository repository;
   private EmployeeManagement employeeManagement;

   private EmployeeManagement getSavedTasks()
   {
       List <EmployeeManagement> savedTasks = this.repository.getAll();
       return savedTasks.iterator().next();
   }

    @Before
    public void setUp() throws Exception
    {
        this.repository = EmployeeManagementRepoImplement.getEmployees();
        this.employeeManagement = EmployeeManagementFactory.manageEmployee(5379, "John",
                "Ensure that employees are doing their Job");
    }

    @Test
    public void create()
    {
        EmployeeManagement created = this.repository.create(this.employeeManagement);
        System.out.println("Creating task... \ncreated: " + created);
        getAll();
    }

    @Test
    public void read()
    {
        EmployeeManagement savedTasks = getSavedTasks();
        System.out.println("Reading... taskID: " +  savedTasks.getTaskID());
        EmployeeManagement reader = this.repository.read(savedTasks.getTaskID());
        System.out.println("On read: " + reader);
        getAll();
        Assert.assertEquals(savedTasks, reader);
    }

    @Test
    public void delete()
    {
        EmployeeManagement existingTask = getSavedTasks();
        this.repository.delete(existingTask.getTaskID());

        getAll();
    }

    @Test
    public void update()
    {
        String newTaskDesc = "Motivate Employees";
        EmployeeManagement management = new EmployeeManagement.Builder().copyTask(getSavedTasks()).empTasks(newTaskDesc)
                .build();
        System.out.println("Updating task..." + management);

        EmployeeManagement updated = this.repository.update(management);
        System.out.println("Task Updated " + updated);
        Assert.assertSame(newTaskDesc, updated.getEmpTasks());

        getAll();
    }

    @Test
    public void getAll()
    {
        List<EmployeeManagement> management = this.repository.getAll();
        System.out.println("Getting All..." + management);
    }
}