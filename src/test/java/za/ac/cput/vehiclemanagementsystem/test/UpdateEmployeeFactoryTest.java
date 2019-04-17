package za.ac.cput.vehiclemanagementsystem.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.UpdateEmployee;
import za.ac.cput.vehiclemanagementsystem.Factory.UpdateEmployeeFactory;

import static org.junit.Assert.*;

public class UpdateEmployeeFactoryTest {

    private UpdateEmployee updateEmployee;
    private UpdateEmployee updateEmp;

    @Before
    public void setUp() throws Exception
    {
        updateEmployee = UpdateEmployeeFactory.getEmployee(201302051, "Monde");
        updateEmp = UpdateEmployeeFactory.getEmployee(201302051, "Mr Monde");
    }

    @Test
    public void getEmployee()
    {
        Assert.assertNotNull(updateEmployee);
    }

    @Test
    public void getEmpNo()
    {
        Assert.assertNotEquals(updateEmployee, updateEmp);
    }
}