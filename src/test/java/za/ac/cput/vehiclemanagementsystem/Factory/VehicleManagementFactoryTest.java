package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleManagementFactory;

public class VehicleManagementFactoryTest {

    private VehicleManagement vm;
    String details = "VW Certified to carry only seated passengers";


    @Before
    public void setUp() throws Exception
    {
        vm = VehicleManagementFactory.getDetails(details);
    }

    @Test
    public void getDetails()
    {
        Assert.assertNotNull(vm.getVehicleDetails());
        System.out.println(vm.toString());
    }
}