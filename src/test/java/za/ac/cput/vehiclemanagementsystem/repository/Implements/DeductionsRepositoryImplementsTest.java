package za.ac.cput.vehiclemanagementsystem.repository.Implements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Approvals;
import za.ac.cput.vehiclemanagementsystem.Domain.Deductions;
import za.ac.cput.vehiclemanagementsystem.Factory.DeductionFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.ApprovalsRepository;
import za.ac.cput.vehiclemanagementsystem.Repository.DeductionsRepository;
import za.ac.cput.vehiclemanagementsystem.Repository.Implements.DeductionsRepositoryImplements;

import static org.junit.Assert.*;

public class DeductionsRepositoryImplementsTest {

    private DeductionsRepository deductionsRepo;
    private Deductions deductions;

    @Before
    public void setUp() throws Exception {
        deductionsRepo = DeductionsRepositoryImplements.getDeductions();
        deductions = DeductionFactory.getDeduction(2134, "Traffic Violation", 251);
    }

    @Test
    public void getDeductions()
    {

    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(deductionsRepo.getAll(), deductionsRepo.getAll());
    }

    @Test
    public void create()
    {
        Assert.assertEquals(deductionsRepo.create(deductions), deductionsRepo.create(deductions));
    }

    @Test
    public void read()
    {
        //Assert.assertEquals(approvalsRepository.read(approvals.getVinNo()), approvalsRepository.read(approvals.getVinNo()));
        //Assert.assertEquals(deductionsRepo.read(deductions.getDeductionsNo(), deductionsRepo.read(deductions.getDeductionsNo())));
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}