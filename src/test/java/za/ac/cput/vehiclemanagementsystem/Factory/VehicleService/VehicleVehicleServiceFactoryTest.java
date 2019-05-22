package za.ac.cput.vehiclemanagementsystem.Factory.VehicleService;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleService.VehicleService;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleServiceFactory.VehicleServiceFactory;

public class VehicleVehicleServiceFactoryTest {

    private VehicleService regVehicle;

    @Before
    public void setUp() throws Exception {
        regVehicle = VehicleServiceFactory.getService("245VR209F3", "Volks Wagen", "2017 Transporter");
    }

    @Test
    public void getService() {
        Assert.assertNotNull(regVehicle.toString());
        System.out.println(regVehicle.toString());
    }
}