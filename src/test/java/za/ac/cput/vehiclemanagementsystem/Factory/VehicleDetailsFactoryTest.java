package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleDetails;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleDetailsFactory;

import static org.junit.Assert.*;

public class VehicleDetailsFactoryTest {

    private VehicleDetails vDetails;

    @Before
    public void setUp() throws Exception {
        vDetails = VehicleDetailsFactory.getDetails("CA 725-430", "Quantum");
    }

    @Test
    public void getDetails() {
        Assert.assertNotNull(vDetails.toString());
        System.out.println(vDetails.toString());
    }
}