package za.ac.cput.vehiclemanagementsystem.Factory.AdminoperationsFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;

import static org.junit.Assert.*;

public class AdminOperationFactoryTest {

    private AdminOperations adminOperations;
    private AdminOperations adminOps;

    @Before
    public void setUp() throws Exception
    {
        adminOperations = AdminOperationFactory.getOperation("SV11865", "Manage a Tour");
        adminOps = AdminOperationFactory.getOperation("SV11865", "Manage a Tour");
    }

    @Test
    public void getOpertionID()
    {
        adminOperations.getOperationID();
        Assert.assertNotNull(adminOperations);
    }

    @Test
    public void getOperation()
    {
        adminOperations.getOperation();
    }

    @Test
    public void getAll()
    {
        Assert.assertNotSame(adminOperations, adminOps);
    }
}