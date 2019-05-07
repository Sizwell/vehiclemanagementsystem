package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicles.Sprinter;
import za.ac.cput.vehiclemanagementsystem.Factory.VehiclesFactory.VehiclesFactory.SprinterFactory;

public class SprinterFactoryTest {

    private Sprinter sprinter;

    @Before
    public void setUp() throws Exception {
        sprinter = SprinterFactory.getSprinter("YHB559882DVDH", 86521033, 22);
    }

    @Test
    public void getSprinter() {
        Assert.assertNotNull(sprinter.toString());
    }

    @Test
    public void getCapacity() {
        Assert.assertNotNull(sprinter.getCapacity());
    }
}