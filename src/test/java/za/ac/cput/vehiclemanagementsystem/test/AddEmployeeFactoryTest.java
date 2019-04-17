package za.ac.cput.vehiclemanagementsystem.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.AddEmployee;
import za.ac.cput.vehiclemanagementsystem.Factory.AddEmployeeFactory;

import static org.junit.Assert.*;

public class AddEmployeeFactoryTest {

    private AddEmployee employeeFactory;
    private AddEmployee employeeFact;

    @Before
    public void setUp() throws Exception
    {
        employeeFactory = AddEmployeeFactory.getEmployee(201302051, "Monde");
        employeeFact = AddEmployeeFactory.getEmployee(201302051, "Monde");
    }

    @Test
    public void getEmployee()
    {
        Assert.assertNotNull(employeeFactory);
    }

    @Test
    public void checkName()
    {
        Assert.assertNotNull(employeeFactory);
    }

    @Test
    public void validateEmpNo()
    {
        Assert.assertNotEquals(employeeFact, employeeFactory);
    }
}