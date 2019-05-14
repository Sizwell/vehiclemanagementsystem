package za.ac.cput.vehiclemanagementsystem.Factory.Deductions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Deductions.Deductions;
import za.ac.cput.vehiclemanagementsystem.Factory.DeductionsFactory.DeductionFactory;

public class DeductionFactoryTest {

    private Deductions deductions;

    @Before
    public void setUp() throws Exception {
        deductions = DeductionFactory.getDeduction(25535, "Vehicle Installment", 5450.29);
    }

    @Test
    public void getDeduction() {
        Assert.assertEquals(deductions.getDeductionAmount(), 5500.20, 0.0);
    }

    @Test
    public void displayDeductions() {
        System.out.println(deductions.toString());
    }
}