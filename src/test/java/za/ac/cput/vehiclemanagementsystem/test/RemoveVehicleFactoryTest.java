package za.ac.cput.vehiclemanagementsystem.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.RemoveVehicle;
import za.ac.cput.vehiclemanagementsystem.Factory.RemoveVehicleFactory;

import static org.junit.Assert.*;

public class RemoveVehicleFactoryTest {

    private RemoveVehicle removeVehicle;

    @Before
    public void setUp() throws Exception
    {
        removeVehicle = RemoveVehicleFactory.getRemovedVehicleDetails("245VR209F3",  "2017 Transporter");
    }

    @Test
    public void getRemovedVehicleDetails()
    {
        Assert.assertNull(removeVehicle);
    }
}