package za.ac.cput.vehiclemanagementsystem.Service.VehicleService.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicle;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleService.VehicleService;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleServiceFactory.VehicleServiceFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleServiceRepository.Implements.VehicleServiceRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Service.VehicleService.VehicleServices;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VehicleServicesImplTest {

    private VehicleServiceRepositoryImplements repository;
    private VehicleService services;


    @Before
    public void setUp() throws Exception
    {
        this.repository = VehicleServiceRepositoryImplements.getService();
        this.services = VehicleServiceFactory.getService("BTY098H467", "Mercedese-Benze", "2018 Sprinter");

    }


    public VehicleService getServices()
    {
        return this.repository.getAll().listIterator().next();
    }

    @Test
    public void create()
    {
        VehicleService vehicleService = this.repository.create(this.services);
        System.out.println("Creating Vehicle Service");

        Assert.assertNotNull(vehicleService);
        Assert.assertSame(vehicleService, this.services);
    }

    @Test
    public void read()
    {
        VehicleService toRead = getServices();

        VehicleService read = this.repository.read(toRead.getVinNo());
        System.out.println("Reading Vehicle Service...\n");

        Assert.assertSame(toRead, read);

    }

    @Test
    public void update()
    {
        String vehicleToService = "2018 Crafter";

        VehicleService toUpdate = new VehicleService.Builder().copyVin(getServices()).model(vehicleToService).build();
        System.out.println("Vehicle model for Service Has been Updated...\n");

        this.repository.update(toUpdate);

        Assert.assertNotSame(vehicleToService, toUpdate.getMake());
    }

    @Ignore
    @Test
    public void delete()
    {
        VehicleService toDelete = getServices();
        this.repository.delete(toDelete.getVinNo());

        getServices();
    }
}