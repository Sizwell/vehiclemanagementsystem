package za.ac.cput.vehiclemanagementsystem.repository.ApprovalsRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Approvals.Approvals;
import za.ac.cput.vehiclemanagementsystem.Factory.ApprovalsFactory.ApprovalsFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.ApprovalsRepository.ApprovalsRepository;
import za.ac.cput.vehiclemanagementsystem.Repository.ApprovalsRepository.Implements.ApprovalsRepositoryImplements;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApprovalsRepositoryImplementsTest {

    private ApprovalsRepositoryImplements repository;
    private Approvals approvals;

    Date date = new Date();
    
    private Approvals getSaved()
    {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        /*repository = ApprovalsRepositoryImplements.getApprovals();
        approvals = ApprovalsFactory.getApproval("PDOF345FVB90V4C", date, "Vehicle approved for tour");
*/

        this.repository = ApprovalsRepositoryImplements.getApprovals();
        this.approvals = ApprovalsFactory.getApproval("Vehicle Has been Approved for tour"
                , date, "Tour around the Peninsula");
    }

    @Test
    public void getApprovals()
    {
        // Assert.assertEquals(repository.getAll(), repository.getAll());
        // System.out.println();
    }

    @Test
    public void getAll()
    {
        Set<Approvals> approvalsSet = this.repository.getAll();
        System.out.println("Getting All Vehicles and Tour Approvals");
        Assert.assertEquals(repository.getAll(), repository.getAll());
        // System.out.println();
    }

    @Test
    public void create()
    {
        Approvals toCreate = this.repository.create(this.approvals);
        System.out.println("Creating an Approval...\n" + toCreate);

        Assert.assertNotNull(toCreate);
        Assert.assertSame(toCreate, this.approvals);
        //Assert.assertEquals(repository.create(approvals), repository.create(approvals));
    }

    @Test
    public void read()
    {
        Approvals toRead = getSaved();
        Approvals reading = this.repository.read(toRead.getApprovalNo());
        System.out.println("Reading Approval...\n" + reading);

        Assert.assertSame(toRead, reading);
        //Assert.assertEquals(repository.read(approvals.getApprovalNo()), repository.read(approvals.getApprovalNo()));
    }

    @Test
    public void update()
    {
        String destination = "Touring the Cape Peninsula";
        Approvals approve = new Approvals.Builder().copyApprovals(getSaved()).details(destination).build();
        System.out.println("Tour destination has been updated...\n" + approve);

        this.repository.update(approve);
        Assert.assertSame(destination, approve.getApprovalNo());
        //Assert.assertEquals(repository.update(approvals), repository.update(approvals));
    }

    @Ignore
    @Test
    public void delete()
    {
        Approvals toDelete = getSaved();
        this.repository.delete(toDelete.getApprovalNo());
        getAll();
        //repository.delete(approvals.getApprovalNo());
    }
}