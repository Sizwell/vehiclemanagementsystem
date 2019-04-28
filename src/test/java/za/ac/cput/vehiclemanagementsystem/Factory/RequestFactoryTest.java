package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Requests;
import za.ac.cput.vehiclemanagementsystem.Factory.RequestFactory;

import java.util.Date;

import static org.junit.Assert.*;

public class RequestFactoryTest {

    private Requests requests;

    Date date = new Date();

    @Before
    public void setUp() throws Exception {
        requests = RequestFactory.getRequests("Tour to Devils Peak", date);
    }

    @Test
    public void getRequests() {
        Assert.assertEquals(requests.getDetails(), requests.getDate());
    }
}