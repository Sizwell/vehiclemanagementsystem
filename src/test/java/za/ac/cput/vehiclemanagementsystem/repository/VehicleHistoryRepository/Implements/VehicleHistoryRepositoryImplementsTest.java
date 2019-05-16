package za.ac.cput.vehiclemanagementsystem.repository.VehicleHistoryRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicle;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleHistory.VehicleHistory;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleHistoryFactory.VehicleHistoryFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleHistoryRepository.Implements.VehicleHistoryRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleHistoryRepository.VehicleHistoryRepository;

import java.util.List;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VehicleHistoryRepositoryImplementsTest {

    private VehicleHistoryRepository repository;
    private VehicleHistory vehicleHistory;

    private VehicleHistory getSavedHistory()
    {
        List <VehicleHistory> savedHistory = this.repository.getHistory();
        return savedHistory.listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = VehicleHistoryRepositoryImplements.getRepository();
        this.vehicleHistory = VehicleHistoryFactory.vehicleHistory("HDS78ZXV7822", "Mini-bus"
                , "No Crashes to date");

    }

    @Test
    public void create()
    {
        VehicleHistory creat = this.repository.create(this.vehicleHistory);
        System.out.println("Vehicle History Created\n");

        getSavedHistory();
        Assert.assertSame(creat, this.vehicleHistory);
    }

    @Test
    public void read()
    {
        VehicleHistory history = getSavedHistory();
        System.out.println(" Reading Vehicle History...\n" + history);

        VehicleHistory read = this.repository.read(history.getVehicleNo());
        System.out.println("Vehicle Saved History....\n" + read);

        getSavedHistory();
        Assert.assertEquals(history, read);
    }

    @Test
    public void update()
    {
        String vehicleHistory = "Vehicle bumped street Light at Simon's Town on 25-10-2018";

        VehicleHistory history= new VehicleHistory.Builder().copyVH(getSavedHistory()).vehHistory(vehicleHistory).build();
        System.out.println("Updating vehicle History...\n" + vehicleHistory);

        VehicleHistory updated = this.repository.update(history);
        System.out.println("Vehicle history Updated...\n" + updated);

        Assert.assertSame(vehicleHistory, updated.getHistory());
        getSavedHistory();
    }

    @Ignore
    @Test
    public void delete()
    {
        VehicleHistory vh = getSavedHistory();
        this.repository.delete(vh.getVehicleNo());
        getSavedHistory();
    }
}