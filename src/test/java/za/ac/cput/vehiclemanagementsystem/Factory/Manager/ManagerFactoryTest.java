package za.ac.cput.vehiclemanagementsystem.Factory.Manager;

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
    public void getManagerID() {
        Assert.assertNotNull(manager.getEmpNumb());
        System.out.println(manager.toString());
    }

    @Test
    public void getManagerDetails()
    {
        Assert.assertNotNull(manager.toString());
    }

}