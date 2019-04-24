package za.ac.cput.vehiclemanagementsystem.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleFactory;

import javax.accessibility.AccessibleStateSet;

import static org.junit.Assert.*;

public class VehicleFactoryTest {

    private Vehicle vehicle;
    private Vehicle veh;

    @Before
    public void setUp() throws Exception
    {
        vehicle = VehicleFactory.getVehicles("86CV88512R36Y", " Coach", " 32 Seater, Diesel, Automatic Transmission");
        veh = VehicleFactory.getVehicles("86CV88512R36Y", " Coach", " 32 Seater, Diesel, Automatic Transmission");

    }

    @Test
    public void getVehicles()
    {
        Assert.assertEquals(vehicle, veh);
    }

    @Test
    public void getVin()
    {
        Assert.assertNotNull(vehicle.getVinNo(), veh);
    }

    @Test
    public void getDifference()
    {
        Assert.assertNotSame("Are Vehicles the Same?", vehicle, veh);
    }
}