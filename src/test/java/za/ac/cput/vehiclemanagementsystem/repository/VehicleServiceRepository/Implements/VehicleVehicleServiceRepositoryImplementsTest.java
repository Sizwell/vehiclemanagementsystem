package za.ac.cput.vehiclemanagementsystem.repository.VehicleServiceRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleServiceFactory.VehicleServiceFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleServiceRepository.Implements.VehicleServiceRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleServiceRepository.VehicleServiceRepository;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleService.VehicleService;

import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VehicleVehicleServiceRepositoryImplementsTest {

    private VehicleServiceRepository repository;
    private VehicleService vehicleService;


    private VehicleService getVehicleService()
    {
        List<VehicleService> vehicleServiceList = this.repository.getAll();
        return vehicleServiceList.listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = VehicleServiceRepositoryImplements.getService();
        this.vehicleService = VehicleServiceFactory.getService("TY790VBAS4", "Luxury Coach", "Comfort Line");
    }

    @Test
    public void create()
    {
        VehicleService vehicleServiceCreate = this.repository.create(this.vehicleService);
        System.out.println("Creating a VehicleService...\n" + vehicleServiceCreate);
        getAll();
        Assert.assertSame(vehicleServiceCreate, this.vehicleService);
    }

    @Test
    public void read()
    {
        VehicleService readingVehicleService = getVehicleService();
        System.out.println("Reading a VehicleService...\n" + readingVehicleService.getVinNo());

        VehicleService read = this.repository.read(readingVehicleService.getVinNo());
        getAll();

        Assert.assertEquals(readingVehicleService, read);
    }

    @Test
    public void update()
    {
        String serviceName = "Comfort Line Cross";
        VehicleService vehicleServiceUpdate = new VehicleService.Builder().copyVin(getVehicleService()).model(serviceName).build();
        System.out.println("Updating Vehicle VehicleService\n");

        VehicleService updated = this.repository.update(vehicleServiceUpdate);
        System.out.println("Vehicle VehicleService has been Updated...\n");

        Assert.assertNotEquals(vehicleServiceUpdate, updated.getModel());

        getAll();
    }

    @Ignore
    @Test
    public void delete()
    {
        VehicleService toDelete = getVehicleService();
        this.repository.delete(toDelete.getVinNo());
        getAll();
    }

    public void getAll()
    {
        List <VehicleService> vehicleServices = this.repository.getAll();
        System.out.println("Getting All Services...\n");
    }
}