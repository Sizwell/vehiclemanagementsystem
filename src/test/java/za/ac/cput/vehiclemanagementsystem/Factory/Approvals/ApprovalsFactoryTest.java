package za.ac.cput.vehiclemanagementsystem.Factory.Approvals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Approvals.Approvals;
import za.ac.cput.vehiclemanagementsystem.Factory.ApprovalsFactory.ApprovalsFactory;

import java.util.Date;

public class ApprovalsFactoryTest {

    private Approvals approvals;

    Date date = new Date();

    @Before
    public void setUp() throws Exception {
        approvals = ApprovalsFactory.getApproval("XZ908V8YTRC3", date, "Tour Destination....");
    }

    @Test
    public void getApproval() {
        Assert.assertNotNull(approvals);
        System.out.println(approvals.getDate());
    }

}