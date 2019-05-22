package za.ac.cput.vehiclemanagementsystem.repository.VehicleDetailsRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleDetails.VehicleDetails;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleDetailsFactory.VehicleDetailsFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleDetailsRepository.Implements.VehicleDetailsRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleDetailsRepository.VehicleDetailsRepository;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VehicleDetailsRepositoryImplementsTest {

    private VehicleDetailsRepository repository;
    private VehicleDetails vehicleDetails;

    private VehicleDetails getVehicleDetails()
    {
        Set<VehicleDetails> vehicleDetailsSet = this.repository.getAll();
        return vehicleDetailsSet.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = VehicleDetailsRepositoryImplements.getVehicleDetails();
        this.vehicleDetails = VehicleDetailsFactory.getDetails("BTX789", "Bus");
    }

    @Test
    public void create()
    {
        VehicleDetails toCreate = this.repository.create(this.vehicleDetails);
        System.out.println("Creating Vehicle Details...\n" + toCreate);

        getAll();
        Assert.assertSame(toCreate, this.vehicleDetails);
    }

    @Test
    public void read()
    {
        VehicleDetails toRead = getVehicleDetails();
        System.out.println("To Read Vehicle Details...\n" + toRead.getVehicleReg());

        VehicleDetails read = this.repository.read(toRead.getVehicleReg());
        System.out.println("Reading Vehicle Details...\n" + read);
        getAll();
        Assert.assertEquals(toRead, read);
    }

    @Test
    public void update()
    {
        String newType = "Tour-Bus";
        VehicleDetails toUpdate = new VehicleDetails.Builder().copyVDetails(getVehicleDetails()).vehType(newType).build();
        System.out.println("Updating Vehicle Details...\n" + toUpdate);

        VehicleDetails update = this.repository.update(toUpdate);
        System.out.println("Vehicle Details have been Updated...\n" + update);

        Assert.assertSame(newType, update.getVehicleType());
    }

    @Ignore
    @Test
    public void delete()
    {
        VehicleDetails toDelete = getVehicleDetails();
        this.repository.delete(toDelete.getVehicleReg());
        getAll();
    }

    @Test
    public void getAll()
    {
        Set<VehicleDetails> all  = this.repository.getAll();
        System.out.println("Getting Al Vehicle Details...\n" + all);
    }
}