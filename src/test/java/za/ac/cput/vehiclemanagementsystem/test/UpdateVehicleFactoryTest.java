package za.ac.cput.vehiclemanagementsystem.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.RegisterVehicle;
import za.ac.cput.vehiclemanagementsystem.Domain.UpdateVehicle;
import za.ac.cput.vehiclemanagementsystem.Factory.RegisterVehicleFactory;
import za.ac.cput.vehiclemanagementsystem.Factory.UpdateVehicleFactory;

import static org.junit.Assert.*;

public class UpdateVehicleFactoryTest {

    private UpdateVehicle updateVehicle;
    private UpdateVehicle updateMyVehicle;

    @Before
    public void setUp() throws Exception
    {
        updateVehicle = UpdateVehicleFactory.vehicleUpdate("245VR209F3", "Volks Wagen", "2017 Transporter");
        updateMyVehicle = UpdateVehicleFactory.vehicleUpdate("245VR209F3", "Volks Wagen", "2019 Transporter R");
    }

    @Test
    public void vehicleUpdate()
    {
        Assert.assertNotSame(updateVehicle, updateMyVehicle);
    }
}