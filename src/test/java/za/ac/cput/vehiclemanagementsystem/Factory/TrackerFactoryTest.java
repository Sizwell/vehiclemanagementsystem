package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Tracker.Tracker;
import za.ac.cput.vehiclemanagementsystem.Factory.TrackerFactory.TrackerFactory;

public class TrackerFactoryTest {

    private Tracker tracker;
    private Tracker updateMyVehicle;

    @Before
    public void setUp() throws Exception {
        tracker = TrackerFactory.vehicleTracker("245VR209F3", "Volks Wagen", "2017 Transporter");
        updateMyVehicle = TrackerFactory.vehicleTracker("245VR209F3", "Volks Wagen", "2019 Transporter R");
    }

    @Test
    public void trackerStatus() {
        Assert.assertNotSame(tracker, updateMyVehicle);
    }
}