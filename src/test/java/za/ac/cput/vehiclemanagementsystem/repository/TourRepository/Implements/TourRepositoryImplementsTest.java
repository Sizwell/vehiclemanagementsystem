package za.ac.cput.vehiclemanagementsystem.repository.TourRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Tour.Tour;
import za.ac.cput.vehiclemanagementsystem.Factory.TourFactory.TourFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.TourRepository.Implements.TourRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.TourRepository.TourRepository;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TourRepositoryImplementsTest {

    private TourRepository repository;
    private Tour tour;

    private Tour getSavedTour()
    {
        Set<Tour> savedTour = this.repository.getAll();
        return savedTour.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = TourRepositoryImplements.getRepository();
        this.tour = TourFactory.getTourDetails(741, "Tour to Lions head", 1);
    }

    @Test
    public void create()
    {
        Tour toCreate = this.repository.create(this.tour);
        System.out.println("Creating Tour...\n" + toCreate);

        getAll();
        Assert.assertSame(toCreate, this.tour);
    }

    @Test
    public void read()
    {
        Tour toRead = getSavedTour();
        System.out.println("About to read tour...\n" + toRead.getTourNo());

       /* Tour reading = this.repository.read(toRead.getTourNo());
        System.out.println("Reading Tour data...\n" + reading);

        getAll();
        Assert.assertEquals(toRead, reading);*/
    }

    @Test
    public void update()
    {
        String destination = "Touring Lions Head";
        Tour tour = new Tour.Builder().copyTour(getSavedTour()).tourDestination(destination).build();
        System.out.println("updating to Destination...\n" + tour);

        Tour toUpdate = this.repository.update(tour);
        System.out.println("Tour has been Updated");
        Assert.assertSame(destination, toUpdate.getDestination());
        getAll();
    }

    @Ignore
    @Test
    public void delete()
    {
        Tour toDelete = getSavedTour();
      //  this.repository.delete(toDelete.getTourNo());

        getAll();
    }

    @Test
    public void getAll()
    {
        Set<Tour> getAll = this.repository.getAll();
        System.out.println("Getting all Tours...\n" + getAll);
    }
}