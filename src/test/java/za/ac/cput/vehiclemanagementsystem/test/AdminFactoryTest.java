package za.ac.cput.vehiclemanagementsystem.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Admin;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminFactory;

import static org.junit.Assert.*;

public class AdminFactoryTest {

    private Admin admin;

    @Before
    public void setUp() throws Exception
    {
        admin = AdminFactory.getAdmin(31250880, "Andile", "Jali");

    }

    @Test
    public void getAdmin()
    {
        Assert.assertEquals(admin.getEmpNumb(), 45897220, 31250880);
    }

    @Test
    public void getNotNull()
    {
        Assert.assertNotNull(admin.getEmpNumb());
    }

}