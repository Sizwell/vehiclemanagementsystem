package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.CheckOut;
import za.ac.cput.vehiclemanagementsystem.Factory.CheckOutFactory;

public class CheckOutFactoryTest {

    private CheckOut checkOut;
    private CheckOut checkOutEmp;

    @Before
    public void setUp() throws Exception {
        checkOut = CheckOutFactory.getCheckOut(201302051, "Monde");
        checkOutEmp = CheckOutFactory.getCheckOut(201302051, "Mr Monde");
    }

    @Test
    public void getCheckOut() {
        Assert.assertNotNull(checkOut);
    }

    @Test
    public void getEmpNo() {
        Assert.assertNotEquals(checkOut, checkOutEmp);
    }
}