package za.ac.cput.vehiclemanagementsystem.Factory.Quantum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicles.Quantum;
import za.ac.cput.vehiclemanagementsystem.Factory.VehiclesFactory.VehiclesFactory.QuantumFactory;

import static org.junit.Assert.*;

public class QuantumFactoryTest {

    private Quantum quantum;
    private Quantum quantumGL;

    @Before
    public void setUp() throws Exception
    {
        quantum = QuantumFactory.getMyQuantum("DJFD7834E44", 542009, 16);
        quantumGL = QuantumFactory.getMyQuantum("VH90RT448FD", 542009, 12);
    }

    @Test
    public void getMyQuantum()
    {
        Assert.assertNotNull(quantum.getVinNo());
        System.out.println(quantum.toString());
    }

    @Test
    public void checkDifference()
    {
        Assert.assertNotSame(quantum, quantumGL);
    }

    @Test
    public void getGlVin()
    {
        Assert.assertNotNull(quantumGL.getVinNo());
    }
}