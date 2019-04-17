package za.ac.cput.vehiclemanagementsystem.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.RemoveEmployee;
import za.ac.cput.vehiclemanagementsystem.Factory.RemoveEmployeeFactory;

import static org.junit.Assert.*;

public class RemoveEmployeeFactoryTest {

    private RemoveEmployee removeEmployee;

    @Before
    public void setUp() throws Exception
    {
        removeEmployee = RemoveEmployeeFactory.getEmployee(201302051, "Monde");
    }

    @Test
    public void getEmployee()
    {
        Assert.assertNotNull(removeEmployee);
    }

    @Test
    public void getEmpNo()
    {
        Assert.assertEquals(removeEmployee.geteNo(), 201302051);
    }
}