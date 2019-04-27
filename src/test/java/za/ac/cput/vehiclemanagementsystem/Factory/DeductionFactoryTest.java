package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Deductions;
import za.ac.cput.vehiclemanagementsystem.Factory.DeductionFactory;

import static org.junit.Assert.*;

public class DeductionFactoryTest {

    private Deductions deductions;

    @Before
    public void setUp() throws Exception
    {
        deductions = DeductionFactory.getDeduction("Vehicle Installment", 5450.29);
    }

    @Test
    public void getDeduction()
    {
        Assert.assertEquals(deductions.getDeductionAmount(), 5500.20, 0.0);
    }

    @Test
    public void displayDeductions()
    {
        System.out.println(deductions.toString());
    }
}