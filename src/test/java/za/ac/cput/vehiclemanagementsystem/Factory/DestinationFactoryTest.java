package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Destinations;


import static org.junit.Assert.*;

public class DestinationFactoryTest {

    private Destinations destinations;

    @Before
    public void setUp() throws Exception
    {
        destinations = DestinationFactory.getDestination(645, "Waterfront", "Cape town 8001");
    }

    @Test
    public void getDestination()
    {
        Assert.assertNotNull(destinations.getDestinName());
    }

    @Test
    public void getDestinationId()
    {
        Assert.assertEquals(destinations.getDestineID(), 297);
    }
}