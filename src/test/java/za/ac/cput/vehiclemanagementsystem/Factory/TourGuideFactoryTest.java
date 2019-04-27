package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.TourGuide;
import za.ac.cput.vehiclemanagementsystem.Factory.TourGuideFactory;

import static org.junit.Assert.*;

public class TourGuideFactoryTest {
    private TourGuide tourGuide;

    @Before
    public void setUp() throws Exception
    {
        tourGuide = TourGuideFactory.getTourGuide(31250880, "Andile", "Jali");
    }

    @Test
    public void getTourGuide()
    {
        Assert.assertNotNull(tourGuide);
    }

    @Test
    public void getName()
    {
        Assert.assertEquals(tourGuide.getEmpName(), "Vuyo");
    }
}