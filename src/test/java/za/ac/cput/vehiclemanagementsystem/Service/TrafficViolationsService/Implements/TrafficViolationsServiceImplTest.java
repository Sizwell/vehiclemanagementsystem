package za.ac.cput.vehiclemanagementsystem.Service.TrafficViolationsService.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.TrafficViolations.TrafficViolations;
import za.ac.cput.vehiclemanagementsystem.Factory.TrafficViolationsFactory.TrafficViolationsFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.TrafficViolationsRepository.Implements.TrafficViolationsRepositoryImplements;

import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TrafficViolationsServiceImplTest {

    private TrafficViolationsRepositoryImplements repository;
    private TrafficViolations violations;

    private TrafficViolations getViolations()
    {
        return this.repository.getAll().listIterator().next();
    }


    @Before
    public void setUp() throws Exception
    {
        this.repository = TrafficViolationsRepositoryImplements.getViolation();
        this.violations = TrafficViolationsFactory.getViolation("XTC101", "Driving over Speed Limit");
    }

    @Test
    public void getAll()
    {
        List<TrafficViolations> trafficViolationsList = this.repository.getAll();
        System.out.println("Getting All Violations");
    }

    @Test
    public void create()
    {
        TrafficViolations toCreate = this.repository.create(this.violations);
        System.out.println("Creeating Traffic Violation...\n" + toCreate);

        Assert.assertNotNull(toCreate);
        Assert.assertSame(toCreate, this.violations);
    }

    @Test
    public void read()
    {
        TrafficViolations toRead = getViolations();
        TrafficViolations read = this.repository.read(toRead.getViolationNo());
        System.out.println("Reading Violation...\n");

        Assert.assertSame(toRead, read);

    }

    @Test
    public void update()
    {
        String newViolation = "Driving Over Speed limit";

        TrafficViolations toUpdate = new TrafficViolations.Builder().copyViolations(getViolations())
                .vioDescripton(newViolation).build();
        System.out.println("Violation has been Updated...\n" + toUpdate);

        this.repository.update(toUpdate);
        Assert.assertSame(newViolation, toUpdate.getVioDescription());
    }

    @Ignore
    @Test
    public void delete()
    {
        TrafficViolations toDelete = getViolations();
        this.repository.delete(toDelete.getViolationNo());

        getAll();
    }
}