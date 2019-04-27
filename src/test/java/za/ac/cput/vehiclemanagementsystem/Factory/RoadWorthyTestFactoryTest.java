package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.RoadWorthyTest;
import za.ac.cput.vehiclemanagementsystem.Factory.RoadWorthyTestFactory;

public class RoadWorthyTestFactoryTest {

    private RoadWorthyTest roadWorthyTest;

    @Before
    public void setUp() throws Exception
    {
        roadWorthyTest = RoadWorthyTestFactory.getRoadWorthyTest("245VR209F3",  "2017 Transporter");
    }

    @Test
    public void getRoadWorthyTest()
    {
        Assert.assertNull(roadWorthyTest);
    }
}