package za.ac.cput.vehiclemanagementsystem.Factory.Driver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Driver;
import za.ac.cput.vehiclemanagementsystem.Factory.EmployeeFactory.EmployeesFactory.DriverFactory;


public class DriverFactoryTest {
    private Driver driver;

    @Before
    public void setUp() throws Exception {
        driver = DriverFactory.getDriver(31250880, "Jonathan", "Jackson");
    }

    @Test
    public void getTourGuide() {
        Assert.assertNotNull(driver);
    }

    @Test
    public void getName() {
        Assert.assertEquals(driver.getEmpName(), "Mike");
    }

    @Test
    public void getEmpNumber() {
        Assert.assertNotNull(driver.toString());
        System.out.println(driver.toString());
    }
}