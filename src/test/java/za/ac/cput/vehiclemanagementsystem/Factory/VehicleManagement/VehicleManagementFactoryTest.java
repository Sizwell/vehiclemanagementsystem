package za.ac.cput.vehiclemanagementsystem.Factory.VehicleManagement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement.VehicleManagement;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleManagementFactory.VehicleManagementFactory;

public class VehicleManagementFactoryTest {

    private VehicleManagement vm;

    @Before
    public void setUp() throws Exception {
        vm = VehicleManagementFactory.getDetails("FV89ER458CV0", "22 - Seater Vw Crafter");
    }

    @Test
    public void getDetails() {
        Assert.assertNotNull(vm.getVehicleDetails());
        System.out.println(vm.toString());
    }
}