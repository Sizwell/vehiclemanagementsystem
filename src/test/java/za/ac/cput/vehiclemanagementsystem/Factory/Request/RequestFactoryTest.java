package za.ac.cput.vehiclemanagementsystem.Factory.Request;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Requests.Requests;
import za.ac.cput.vehiclemanagementsystem.Factory.RequestFactory.RequestFactory;

import java.util.Date;

public class RequestFactoryTest {

    private Requests requests;

    Date date = new Date();

    @Before
    public void setUp() throws Exception {
        requests = RequestFactory.getRequests("A47", "Tour to Devils Peak", date);
    }

    @Test
    public void getRequests() {
        Assert.assertEquals(requests.getDetails(), requests.getDetails());
    }
}