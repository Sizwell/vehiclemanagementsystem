package za.ac.cput.vehiclemanagementsystem.Service.TrackerService.Implements;

import org.hibernate.validator.constraints.URL;
import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Tracker.Tracker;
import za.ac.cput.vehiclemanagementsystem.Factory.TrackerFactory.TrackerFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.TrackerRepository.Implements.TrackerRepoImplements;

import java.util.List;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TackerServiceImplTest {

    private TrackerRepoImplements repository;
    private Tracker tracker;

    private Tracker getTracker()
    {
        return this.repository.getAll().listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = TrackerRepoImplements.getTracker();
        this.tracker = TrackerFactory.vehicleTracker("TVI873579", "Active Tracker", "2019 Model");
    }

    @Test
    public void getAll()
    {
        List<Tracker> trackerList = this.repository.getAll();
        System.out.println("------ Tracker Details -----\n" + trackerList);
    }

    @Test
    public void create()
    {
        Tracker tracker = this.repository.create(this.tracker);
        System.out.println("Creating new Vehicle Tracker...\n");

        Assert.assertSame(tracker, this.tracker);
        Assert.assertNotNull(tracker);
    }

    @Test
    public void read()
    {
        Tracker toRead = getTracker();

        Tracker read = this.repository.read(toRead.getTrackerNo());
        System.out.println("Reading Tracker details..." + read);

        Assert.assertSame(toRead, read);
    }

    @Test
    public void update()
    {
        String trackerInfo = "Passive Tracker";

        Tracker toUpdate = new Tracker.Builder().copyTracker(getTracker()).trackerType(trackerInfo).build();
        System.out.println("Tracker has been Updated...\n" +toUpdate);

        this.repository.update(toUpdate);

        Assert.assertSame(trackerInfo, toUpdate.getTrackerType());
    }
    @Ignore
    @Test
    public void delete()
    {
        Tracker toDelete = getTracker();

        this.repository.delete(toDelete.getTrackerNo());
    }
}