package za.ac.cput.vehiclemanagementsystem.repository.RoadWorthyTestRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.RoadWorthyTest.RoadWorthyTest;
import za.ac.cput.vehiclemanagementsystem.Factory.RoadWorthTestFactory.RoadWorthyTestFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.RoadWorthyTestRepository.Implements.RoadWorthyTestImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.RoadWorthyTestRepository.RoadWorthyTestRepository;

import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoadWorthyTestImplementsTest {

    private RoadWorthyTestRepository repository;
    private RoadWorthyTest test;

    private RoadWorthyTest getRoadWorthyTest()
    {
        List <RoadWorthyTest> roadWorthyTestList = this.repository.getAll();
        return roadWorthyTestList.listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = RoadWorthyTestImplements.getRepository();
        this.test = RoadWorthyTestFactory.getRoadWorthyTest("AC78V9087POK", "Bus");
    }

    @Test
    public void create()
    {
        RoadWorthyTest creating = this.repository.create(this.test);
        System.out.println("Creating Road Worthy Test..." + creating);

        getAll();
        Assert.assertSame(creating, this.test);
    }

    @Test
    public void read()
    {
        RoadWorthyTest reading = getRoadWorthyTest();
        System.out.println("Reading Road worthy Test...");

        RoadWorthyTest read = this.repository.read(reading.getVinNo());
        System.out.println("Road Worthy Test read...");

        getAll();
        Assert.assertEquals(reading, read);
    }

    @Test
    public void update()
    {
        String updateTest = "Taxi";

        RoadWorthyTest test = new RoadWorthyTest.Builder().copy(getRoadWorthyTest()).model(updateTest).build();
        System.out.println("...Updating Road Worthy Test..." + test);

        RoadWorthyTest updated = this.repository.update(test);
        System.out.println("Road Worthy Test has been Updated..." + updated);

        Assert.assertNotSame(updateTest, updated.getModel());
    }
    @Ignore
    @Test
    public void delete()
    {
        RoadWorthyTest toDelete = getRoadWorthyTest();
        this.repository.delete(toDelete.getVinNo());

        getAll();
    }

    @Test
    public void getAll()
    {
        List <RoadWorthyTest> roadWorthyTestList = this.repository.getAll();
        System.out.println("... Getting all RoadWorthyTests...\n" + roadWorthyTestList);
    }
}