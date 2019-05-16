package za.ac.cput.vehiclemanagementsystem.repository.TrafficViolationsRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.TrafficViolations.TrafficViolations;
import za.ac.cput.vehiclemanagementsystem.Factory.TrafficViolationsFactory.TrafficViolationsFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.TrafficViolationsRepository.Implements.TrafficViolationsRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.TrafficViolationsRepository.TrafficViolationsRepository;

import java.util.List;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TrafficViolationsRepositoryImplementsTest {

    private TrafficViolationsRepository repository;
    private TrafficViolations trafficViolations;

    private TrafficViolations getSavedViolations()
    {
        List <TrafficViolations> trafficViolationsList = this.repository.getAll();
        return trafficViolationsList.listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = TrafficViolationsRepositoryImplements.getViolation();
        this.trafficViolations = TrafficViolationsFactory.getViolation("TYS346VV789", "Skipped red Robot");
    }

    @Test
    public void create()
    {
        TrafficViolations violations = this.repository.create(this.trafficViolations);
        System.out.println("...Traffic Violations...\n");
        getAll();
        Assert.assertSame(violations, this.trafficViolations);
    }

    @Test
    public void read()
    {
        TrafficViolations tv = getSavedViolations();
        System.out.println("Reading Traffic Violations...\n" + tv);

        TrafficViolations read = this.repository.read(tv.getViolationNo());
        System.out.println("Violation has been Read...\n" + read);

        getAll();

        Assert.assertEquals(tv, read);
    }

    @Test
    public void update()
    {
        String violationDesc = "Skipped red Traffic Light";

        TrafficViolations violation = new TrafficViolations.Builder().copyViolations(getSavedViolations())
                .vioDescripton(violationDesc).build();
        System.out.println("Updating Traffic Violation Description...\n");

        TrafficViolations updated = this.repository.update(violation);
        System.out.println("...Violation has been Updated...\n" + updated);

        Assert.assertSame(violationDesc, updated.getVioDescription());
    }

    @Ignore
    @Test
    public void delete()
    {
        TrafficViolations toDelete = getSavedViolations();
        this.repository.delete(toDelete.getViolationNo());

        getAll();
    }

    public void getAll()
    {
        List<TrafficViolations> trafficViolations = this.repository.getAll();
        System.out.println("... All Violations...\n" + trafficViolations);
    }
}