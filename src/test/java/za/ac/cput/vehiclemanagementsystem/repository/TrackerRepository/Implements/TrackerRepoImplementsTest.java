package za.ac.cput.vehiclemanagementsystem.repository.TrackerRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Tracker.Tracker;
import za.ac.cput.vehiclemanagementsystem.Factory.TrackerFactory.TrackerFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.TrackerRepository.Implements.TrackerRepoImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.TrackerRepository.TrackerRepository;

import java.util.List;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TrackerRepoImplementsTest {

    private TrackerRepository repository;
    private Tracker tracker;

    private Tracker getSavedTracker()
    {
        List <Tracker> savedTracker = this.repository.getAll();
        return savedTracker.listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = TrackerRepoImplements.getTracker();
        this.tracker = TrackerFactory.vehicleTracker("IFD7890BN45", "Taxi", "2018 GL Model");
    }

    @Test
    public void create()
    {
        Tracker trackerCreate = this.repository.create(this.tracker);
        System.out.println("Creating Tracker...\n");

        getAll();
    }

    @Test
    public void read()
    {
        Tracker trackerRead = getSavedTracker();
        System.out.println("Attempting Read Tracker...\n");

        Tracker read = this.repository.read(trackerRead.getTrackerNo());
        System.out.println("Tracker has been read...\n");

        getAll();
        Assert.assertEquals(trackerRead, read);
    }

    @Test
    public void update()
    {
        String trackerUpdate = "Toyota Quantum";

        Tracker update = new Tracker.Builder().copyTracker(getSavedTracker()).make(trackerUpdate).build();
        System.out.println("Tracker Has been been Updated...\n");

        Tracker updatedT = this.repository.update(update);
        System.out.println("Updated Tracker... \n" + updatedT);

        Assert.assertSame(trackerUpdate, updatedT.getMake());
        getAll();
    }

    @Ignore
    @Test
    public void delete()
    {
        Tracker toDelete = getSavedTracker();
        this.repository.delete(toDelete.getTrackerNo());

        getAll();
    }

    public void getAll()
    {
        List<Tracker> trackerList = this.repository.getAll();
        System.out.println("... Getting All Trackers...\n");
    }
}