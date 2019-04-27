package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Cab;
import za.ac.cput.vehiclemanagementsystem.Factory.CabFactory;

import static org.junit.Assert.*;

public class CabFactoryTest {

    private Cab cab;
    private Cab cab2;

    @Before
    public void setUp() throws Exception
    {
        cab = CabFactory.getCab("B69LJKYTC854", "VW vivo Sedan", "Luyanda");
        cab2 = CabFactory.getCab("B69LJKYTC854", "VW vivo Sedan", "Anikue");
    }

    @Test
    public void getCab()
    {
        Assert.assertNotEquals(cab, cab2);
    }

    @Test
    public void getCabDriver()
    {
        Assert.assertNotSame(cab, cab2);
    }

    @Test
    public void getCabtype()
    {
        Assert.assertEquals(cab.getVehicleType(), cab2.getVehicleType());
        System.out.println(cab.toString() + "\n");
        System.out.println(cab2.toString());
    }
}