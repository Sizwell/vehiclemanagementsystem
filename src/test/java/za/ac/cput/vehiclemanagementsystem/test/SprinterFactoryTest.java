package za.ac.cput.vehiclemanagementsystem.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Sprinter;
import za.ac.cput.vehiclemanagementsystem.Factory.SprinterFactory;

import static org.junit.Assert.*;

public class SprinterFactoryTest {

    private Sprinter sprinter;

    @Before
    public void setUp() throws Exception
    {
        sprinter = SprinterFactory.getSprinter("YHB559882DVDH", 86521033, 22);
    }

    @Test
    public void getSprinter()
    {
        Assert.assertNotNull(sprinter.toString());
    }

    @Test
    public void getCapacity()
    {
        Assert.assertNotNull(sprinter.getCapacity());
    }
}