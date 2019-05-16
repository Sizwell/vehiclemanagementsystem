package za.ac.cput.vehiclemanagementsystem.repository.RequestsRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Requests.Requests;
import za.ac.cput.vehiclemanagementsystem.Factory.RequestFactory.RequestFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.RequestsRepository.Implements.RequestsRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.RequestsRepository.RequestsRepository;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class RequestsRepositoryImplementsTest {

    private RequestsRepository repository;
    private Requests requests;

    private Requests getRequests()
    {
        List<Requests> savedRequests = this.repository.getAll();
        return savedRequests.listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        Date date = new Date();
        this.repository = RequestsRepositoryImplements.getRequests();
        this.requests = RequestFactory.getRequests("A47", "Requesting a Tour Bus", date);
    }

    @Test
    public void create()
    {
        Requests createdReq = this.repository.create(this.requests);
        System.out.println("Creating a new Request...\n" + createdReq);
        getAll();
        Assert.assertSame(createdReq, this.requests);
    }

    @Test
    public void read()
    {
        Requests savedReq = getRequests();
        System.out.println("Reading Requests \n" + savedReq.getReqNo());

        Requests read = this.repository.read(savedReq.getReqNo());
        getAll();
        Assert.assertEquals(savedReq, read);
    }

    @Test
    public void update()
    {
        String requestTitle = "Requesting a Vehicle";

        Requests requests = new Requests.Builder().copyRequests(getRequests()).details(requestTitle).build();
        System.out.println("Updating Requests \n" + requests);

        Requests updated = this.repository.update(requests);
        System.out.println("Request has been Updated...\n" + updated);

        Assert.assertNotSame(requestTitle, updated.getDetails());

       // getAll();

    }

    @Ignore
    @Test
    public void delete()
    {
        Requests deleteRequests = getRequests();
        this.repository.delete(deleteRequests.getReqNo());

        getAll();
    }

    @Test
    public void getAll()
    {
        List <Requests> requestsList = this.repository.getAll();
        System.out.println("\t...Getting All Requests...\n" + requestsList);
    }
}