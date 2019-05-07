package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicles.Minibus;
import za.ac.cput.vehiclemanagementsystem.Factory.VehiclesFactory.VehiclesFactory.MinibusFactory;

public class MinibusFactoryTest {

    private Minibus minibus;

    @Before
    public void setUp() throws Exception {
        minibus = MinibusFactory.getMyMinibus("PO236CV2132Z", 265870, 7);
    }

    @Test
    public void getMyMinibus() {
        Assert.assertNotNull(minibus);
        System.out.println(minibus.toString());
    }

    @Test
    public void getDriverNo() {
        Assert.assertNotNull(minibus.getDriverNo());
    }
}