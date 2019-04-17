package za.ac.cput.vehiclemanagementsystem.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.RegisterVehicle;
import za.ac.cput.vehiclemanagementsystem.Factory.RegisterVehicleFactory;

import static org.junit.Assert.*;

public class RegisterVehicleFactoryTest {

    private RegisterVehicle regVehicle;

    @Before
    public void setUp() throws Exception
    {
        regVehicle = RegisterVehicleFactory.getRegistration("245VR209F3", "Volks Wagen", "2017 Transporter");
    }

    @Test
    public void getRegistration()
    {
        Assert.assertNotNull(regVehicle.toString());
        System.out.println(regVehicle.toString());
    }
}