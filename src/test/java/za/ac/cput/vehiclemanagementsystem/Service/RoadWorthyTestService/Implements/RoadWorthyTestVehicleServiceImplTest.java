package za.ac.cput.vehiclemanagementsystem.Service.RoadWorthyTestService.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.RoadWorthyTest.RoadWorthyTest;
import za.ac.cput.vehiclemanagementsystem.Factory.RoadWorthTestFactory.RoadWorthyTestFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.RoadWorthyTestRepository.Implements.RoadWorthyTestRepositoryImplements;

import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoadWorthyTestVehicleServiceImplTest {

    private RoadWorthyTestRepositoryImplements repository;
    private RoadWorthyTest roadWorthyTest;

    private RoadWorthyTest getRoadWorthyTest()
    {
        return this.repository.getAll().listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = RoadWorthyTestRepositoryImplements.getRepository();
        this.roadWorthyTest = RoadWorthyTestFactory.getRoadWorthyTest("TY34BG7YIP09", "Bus", "Test Passed");
    }

    @Test
    public void getAll()
    {
        List <RoadWorthyTest> roadWorthyTestList = this.repository.getAll();
        System.out.println("Getting all Road Worthy Tests...\n");
    }

    @Test
    public void create()
    {
        RoadWorthyTest create = this.repository.create(this.roadWorthyTest);
        System.out.println("Creating a new Road worthy test...\n" + create);

        Assert.assertSame(create, this.roadWorthyTest);
        Assert.assertNotNull(create);
    }

    @Test
    public void read()
    {
        RoadWorthyTest reader = getRoadWorthyTest();

        RoadWorthyTest read = this.repository.read(reader.getVinNo());
        System.out.println("Reading test...\n" + read);

        Assert.assertSame(reader, read);
    }

    @Test
    public void update()
    {
        String test = "vehicle has passed RoadWorthy Test";

        RoadWorthyTest update = new RoadWorthyTest.Builder().copy(getRoadWorthyTest()).testResults(test).build();
        System.out.println("Updating Vehicle test Results...\n" + update);

        this.repository.update(update);
        Assert.assertSame(test, update.getTestResults());
    }

    @Ignore
    @Test
    public void delete()
    {
        RoadWorthyTest toDelete = getRoadWorthyTest();
        this.repository.delete(toDelete.getVinNo());
        getAll();
    }
}