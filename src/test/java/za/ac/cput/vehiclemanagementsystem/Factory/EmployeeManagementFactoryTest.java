package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement;
import za.ac.cput.vehiclemanagementsystem.Factory.EmployeeManagementFactory;

import static org.junit.Assert.*;

public class EmployeeManagementFactoryTest {

    private EmployeeManagement empManagement;
    private EmployeeManagement empManage;

    @Before
    public void setUp() throws Exception
    {
        empManagement = EmployeeManagementFactory.manageEmployee(213207834, "Luvuyo", "Administration");
        empManage = EmployeeManagementFactory.manageEmployee(213207834, "Luvuyo", "Tour Guide");
    }

    @Test
    public void manageEmployee()
    {
        Assert.assertNotNull(empManagement);
    }

    @Test
    public void checkTask()
    {
        Assert.assertSame(empManagement, empManage);
    }
}