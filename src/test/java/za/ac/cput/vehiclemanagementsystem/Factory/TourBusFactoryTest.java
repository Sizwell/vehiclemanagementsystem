package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.TourBus;
import za.ac.cput.vehiclemanagementsystem.Factory.TourBusFactory;

public class TourBusFactoryTest {

    private TourBus tb;

    @Before
    public void setUp() throws Exception
    {
        tb = TourBusFactory.getTourBus("87CVX197TOA846", " Vito",  "Mercedes-Benze ");
    }

    @Test
    public void getTourBus()
    {
        Assert.assertEquals(tb.getVinNo(), tb.getBusType(), tb.getVehName());
        System.out.println(tb.toString());
    }
}