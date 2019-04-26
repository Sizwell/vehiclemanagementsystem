package za.ac.cput.vehiclemanagementsystem.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Service;
import za.ac.cput.vehiclemanagementsystem.Factory.ServiceFactory;

public class ServiceFactoryTest {

    private Service regVehicle;

    @Before
    public void setUp() throws Exception
    {
        regVehicle = ServiceFactory.getService("245VR209F3", "Volks Wagen", "2017 Transporter");
    }

    @Test
    public void getService()
    {
        Assert.assertNotNull(regVehicle.toString());
        System.out.println(regVehicle.toString());
    }
}