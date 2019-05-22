package za.ac.cput.vehiclemanagementsystem.repository.DeductionsRepository.Implements;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.cput.vehiclemanagementsystem.Domain.Deductions.Deductions;
import za.ac.cput.vehiclemanagementsystem.Factory.DeductionsFactory.DeductionFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.DeductionsRepository.DeductionsRepository;
import za.ac.cput.vehiclemanagementsystem.Repository.DeductionsRepository.Implements.DeductionsRepositoryImplements;

import java.util.Set;

/*@SpringBootTest
@RunWith(SpringRunner.class)*/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DeductionsRepositoryImplementsTest {

  //  @Autowired
    private DeductionsRepository deductionsRepo;
    private Deductions deductions;

    @Before
    public void setUp() throws Exception {
        deductionsRepo = DeductionsRepositoryImplements.getDeductions();
        deductions = DeductionFactory.getDeduction("2134", "Traffic Violation", 251);
    }

    @Test
    public Deductions getDeductions()
    {
        Set<Deductions> deductionsMap = this.deductionsRepo.getAll();
        return deductionsMap.iterator().next();
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(deductionsRepo.getAll(), deductionsRepo.getAll());
    }

    @Test
    public void create()
    {
        Deductions create = this.deductionsRepo.create(this.deductions);
        System.out.println("Creating Deductions...\n" + create.getDeductionsNo());

        getAll();
        Assert.assertSame(create, this.deductions);
    }

    @Test
    public void read()
    {
        Deductions toRead = getDeductions();
        System.out.println("Reading Deductions...\n" + toRead);

        Deductions reading = this.deductionsRepo.read(toRead.getDeductionsNo());
        System.out.println("Read Deductions...\n" + reading);
        getAll();

        Assert.assertEquals(toRead, reading);
    }

    @Test
    public void update()
    {
        String deductionType = "Warn-out tires";
        Deductions deductions = new Deductions.Builder().deductionsCopy(getDeductions()).deductType(deductionType).build();
        System.out.println("About to Update Deductions...\n"+ deductions);

        Deductions toUpdate = this.deductionsRepo.update(deductions);
        System.out.println("Updating Deductions...\n" + toUpdate);
        Assert.assertSame(deductionType, toUpdate.getDeductionType());

        getAll();
    }

    @Ignore
    @Test
    public void delete()
    {
        Deductions toDelete = getDeductions();
        this.deductionsRepo.delete(toDelete.getDeductionsNo());
        getAll();
    }
}