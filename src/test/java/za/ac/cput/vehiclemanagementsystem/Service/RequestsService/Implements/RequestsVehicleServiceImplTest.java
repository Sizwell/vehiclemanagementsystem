package za.ac.cput.vehiclemanagementsystem.Service.RequestsService.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Requests.Requests;
import za.ac.cput.vehiclemanagementsystem.Factory.RequestFactory.RequestFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.RequestsRepository.Implements.RequestsRepositoryImplements;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RequestsVehicleServiceImplTest {

    private RequestsRepositoryImplements repository;
    private Requests requests;

    Date date = new Date();

    private Requests getSavedRequests()
    {
        return this.repository.getAll().listIterator().next();
    }


    @Before
    public void setUp() throws Exception
    {
        this.repository = RequestsRepositoryImplements.getRequests();
        this.requests = RequestFactory.getRequests("TCX807T1", "Tour to Cape Wine lands", date);
    }

    @Test
    public void getAll()
    {
        List <Requests> requestsList = repository.getAll();
        System.out.println("Retrieving All Requests...\n");
    }

    @Test
    public void create()
    {
        Requests create = this.repository.create(this.requests);
        System.out.println("Creating a new Request...\n" + create);

        Assert.assertNotNull(create);
        Assert.assertSame(create, this.requests);
    }

    @Test
    public void read()
    {
        Requests toRead = getSavedRequests();

        Requests reader = this.repository.read(toRead.getReqNo());
        Assert.assertSame(toRead, reader);
    }

    @Test
    public void update()
    {
        String newRequest = "Requesting a Luxury Coach for Tour";

        Requests requests = new Requests.Builder().copyRequests(getSavedRequests()).details(newRequest).build();
        System.out.println("Updating Request...\n" + requests);

        this.repository.update(requests);
        Assert.assertSame(newRequest, requests.getDetails());
    }

    @Ignore
    @Test
    public void delete()
    {
        Requests toDelete = getSavedRequests();
        this.repository.delete(toDelete.getReqNo());

        getAll();
    }
}