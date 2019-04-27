package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Approvals;
import za.ac.cput.vehiclemanagementsystem.Factory.ApprovalsFactory;

import java.sql.DatabaseMetaData;
import java.util.Date;

import static org.junit.Assert.*;

public class ApprovalsFactoryTest {

    private Approvals approvals;

    Date date = new Date();

    @Before
    public void setUp() throws Exception
    {
        approvals = ApprovalsFactory.getApproval("XZ908V8YTRC3", date, "Tour Destination....");
    }

    @Test
    public void getApproval()
    {
        Assert.assertNotNull(approvals);
        System.out.println(approvals.getDate());
    }

}