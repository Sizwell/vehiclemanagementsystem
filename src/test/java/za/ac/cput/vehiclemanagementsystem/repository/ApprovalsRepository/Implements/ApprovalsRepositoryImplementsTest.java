package za.ac.cput.vehiclemanagementsystem.repository.ApprovalsRepository.Implements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Approvals.Approvals;
import za.ac.cput.vehiclemanagementsystem.Factory.ApprovalsFactory.ApprovalsFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.ApprovalsRepository.ApprovalsRepository;
import za.ac.cput.vehiclemanagementsystem.Repository.ApprovalsRepository.Implements.ApprovalsRepositoryImplements;

import java.util.Date;

import static org.junit.Assert.*;

public class ApprovalsRepositoryImplementsTest {

    private ApprovalsRepository approvalsRepository;
    private Approvals approvals;

    Date date = new Date();

    @Before
    public void setUp() throws Exception
    {
        approvalsRepository = ApprovalsRepositoryImplements.getApprovals();
        approvals = ApprovalsFactory.getApproval("PDOF345FVB90V4C", date, "Vehicle approved for tour");
    }

    @Test
    public void getApprovals()
    {
        // Assert.assertEquals(approvalsRepository.getAll(), approvalsRepository.getAll());
        // System.out.println();
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(approvalsRepository.getAll(), approvalsRepository.getAll());
        // System.out.println();
    }

    @Test
    public void create() {
        Assert.assertEquals(approvalsRepository.create(approvals), approvalsRepository.create(approvals));
    }

    @Test
    public void read()
    {
        Assert.assertEquals(approvalsRepository.read(approvals.getVinNo()), approvalsRepository.read(approvals.getVinNo()));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(approvalsRepository.update(approvals), approvalsRepository.update(approvals));
    }

    @Test
    public void delete()
    {
        approvalsRepository.delete(approvals.getVinNo());
    }
}