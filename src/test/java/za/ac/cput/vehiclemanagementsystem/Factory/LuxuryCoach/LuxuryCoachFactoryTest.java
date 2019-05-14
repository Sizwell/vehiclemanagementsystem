package za.ac.cput.vehiclemanagementsystem.Factory.LuxuryCoach;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicles.LuxuryCoach;
import za.ac.cput.vehiclemanagementsystem.Factory.VehiclesFactory.VehiclesFactory.LuxuryCoachFactory;

import static org.junit.Assert.*;

public class LuxuryCoachFactoryTest {

    private LuxuryCoach luxuryCoach;
    private LuxuryCoach coach;

    @Before
    public void setUp() throws Exception
    {
        luxuryCoach = LuxuryCoachFactory.getMyLuxuryCoach("CVF094YD56", 23586, 64);
        coach = LuxuryCoachFactory.getMyLuxuryCoach("CVF094YD56", 23587, 34);
    }

    @Test
    public void getMyLuxuryCoach()
    {
        Assert.assertNotNull(luxuryCoach.getVinNo());
    }

    @Test
    public void getDriverNumber()
    {
        Assert.assertNotSame(luxuryCoach, coach);
    }
}