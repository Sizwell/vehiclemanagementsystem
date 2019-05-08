package za.ac.cput.vehiclemanagementsystem.Factory.Position;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Position.Position;

import static org.junit.Assert.*;

public class PositionFactoryTest {

    private Position position;
    private Position mPosition;

    @Before
    public void setUp() throws Exception
    {
        position = PositionFactory.getFactory(8645, "Tour Operator");
        mPosition = PositionFactory.getFactory(8315, "Tour Organizer");
    }

    @Test
    public void getFactory()
    {
        System.out.println(position.toString());
    }

    @Test
    public void getRoleID()
    {
        Assert.assertNotNull(position.getRoleID());
        System.out.println(position.getRoleID());
    }

    @Test
    public void getRoleDesc()
    {
        Assert.assertNotEquals(position, mPosition);
    }

}