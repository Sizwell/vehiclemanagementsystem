package za.ac.cput.vehiclemanagementsystem.Factory.VehicleHistoryFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleHistory.VehicleHistory;

public class VehicleHistoryFactoryTest {

    private VehicleHistory vehicleHistory;

    @Before
    public void setUp() throws Exception
    {
        vehicleHistory = VehicleHistoryFactory.vehicleHistory("B78E45GHY5", "Taxi",
                "Took on 3 Tours around the Cape Peninsula");
    }

    @Test
    public void vehicleHistory()
    {
        System.out.println(vehicleHistory.toString());
    }

    @Test
    public void getVehicleNumber()
    {
        Assert.assertNotNull(vehicleHistory.getHistoryNo());
    }

    @Test
    public void getVehicleHistory()
    {
        Assert.assertNotNull(vehicleHistory.getHistory());
        System.out.println(vehicleHistory.getHistory());
    }
}