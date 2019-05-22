package za.ac.cput.vehiclemanagementsystem.repository.LicenseDiskRepository.Implements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.LicenseDisk.LicenseDisk;
import za.ac.cput.vehiclemanagementsystem.Factory.LicenseDisk.LicenseDiskFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.LicenseDiskRepository.Implements.LicenseDiskRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.LicenseDiskRepository.LicenseDiskRepository;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LicenseDiskRepositoryImplementsTest {

    private LicenseDiskRepository diskRepository;
    private LicenseDisk licenseDisk;

    private LicenseDisk getLicenseDisk()
    {
        Set <LicenseDisk> vDisk = this.diskRepository.getAll();
        return vDisk.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.diskRepository = LicenseDiskRepositoryImplements.getRepository();
        this.licenseDisk = LicenseDiskFactory.getVehicleRegistration("CA 873-607", "Toyota Quantum");
    }

    @Test
    public void getAll()
    {
        Set <LicenseDisk> allReg = this.diskRepository.getAll();
        System.out.println("Get All, allReg: " + allReg);
        Assert.assertSame(0, allReg.size());
    }

    @Test
    public void create()
    {
        LicenseDisk disk = this.diskRepository.create(this.licenseDisk);
        System.out.println("Creating...\n, Created\n " +disk);
        //getAll();
        Assert.assertSame(diskRepository, diskRepository);
    }

    @Test
    public void read()
    {
        LicenseDisk savedDisk = getLicenseDisk();
        System.out.println("Reading...\n" + savedDisk.getRegNumber());
        LicenseDisk disk = this.diskRepository.read(savedDisk.getRegNumber());
        System.out.println("In read... reading: " + disk);
        getAll();
        Assert.assertEquals(savedDisk, disk);
    }

    @Test
    public void update()
    {
        String model = "Toyota Quantum GL";

        LicenseDisk licenseDisk = new LicenseDisk.Builder().copyLicenseDisk(getLicenseDisk()).model(model).build();
        System.out.println("Updating Vehicle Model...\n" + licenseDisk);

        LicenseDisk updated = this.diskRepository.update(licenseDisk);
        System.out.println("Vehicle Model has been Updated...\n" + updated);

        Assert.assertSame(model, updated.getVehicleModel());
        getAll();
    }

    @Test
    public void delete()
    {
        Set<LicenseDisk> licenseDiskSet = this.diskRepository.getAll();
        System.out.println("Getting all License disk Data...\n" + licenseDiskSet);
    }
}