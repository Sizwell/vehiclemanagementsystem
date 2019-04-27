package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.CheckIn;
import za.ac.cput.vehiclemanagementsystem.Factory.CheckInFactory;

public class CheckInFactoryTest {

    private CheckIn checkInFactory;
    private CheckIn checkInFact;

    @Before
    public void setUp() throws Exception
    {
        checkInFactory = CheckInFactory.getCheckIn(201302051, "Monde");
        checkInFact = CheckInFactory.getCheckIn(201302051, "Monde");
    }

    @Test
    public void getCheckIn()
    {
        Assert.assertNotNull(checkInFactory);
    }

    @Test
    public void checkName()
    {
        Assert.assertNotNull(checkInFactory);
    }

    @Test
    public void validateEmpNo()
    {
        Assert.assertNotEquals(checkInFact, checkInFactory);
    }
}