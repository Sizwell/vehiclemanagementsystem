package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Manager;
import za.ac.cput.vehiclemanagementsystem.Factory.EmployeeFactory.EmployeesFactory.ManagerFactory;

public class ManagerFactoryTest {

    private Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = ManagerFactory.getManager(2368942, "Cwaka", "Ncikana",
                "Good Office Management Skills");
    }

    @Test
    public void getManager() {
        Assert.assertNotNull(manager);
        System.out.println(manager.toString());
    }
}