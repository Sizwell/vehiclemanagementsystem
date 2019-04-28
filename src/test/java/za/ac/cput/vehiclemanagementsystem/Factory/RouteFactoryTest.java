package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Routes;
import za.ac.cput.vehiclemanagementsystem.Factory.RouteFactory;

import static org.junit.Assert.*;

public class RouteFactoryTest {

    private Routes routes;

    @Before
    public void setUp() throws Exception {
        routes = RouteFactory.getDeduction(245, "Chapman's Peak Pass", "Cape Point");
    }

    @Test
    public void getDeduction() {
        Assert.assertNotNull(routes.getRouteName());
    }
}