package za.ac.cput.vehiclemanagementsystem.Factory.TourFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Tour.Tour;

import static org.junit.Assert.*;

public class TourFactoryTest {

    private Tour tour;
    private Tour tour2;

    @Before
    public void setUp() throws Exception {
        tour = TourFactory.getTourDetails(365, "Cape Wine lands", 3);
        tour2 = TourFactory.getTourDetails(246, "V n A Waterfront", 1);
    }

    @Test
    public void getTour() {
        System.out.println(tour.toString());
    }

    @Test
    public void getTourDuration() {
        Assert.assertNotSame(tour.getTourDuration(), tour2.getTourDuration());
    }

    @Test
    public void getDestination() {
        Assert.assertEquals(tour.getDestination(), tour2.getDestination());
        System.out.println(tour.toString() + "\n");
        System.out.println(tour2.toString());
    }
}