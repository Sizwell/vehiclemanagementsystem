package za.ac.cput.vehiclemanagementsystem.Service.VehicleManagementService.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicle;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement.VehicleManagement;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleManagementFactory.VehicleManagementFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleManagementRepository.Implements.VehicleManagementRepositoryImpl;

import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class VehicleManagementServiceImplTest {

    private VehicleManagementRepositoryImpl repository;
    private VehicleManagement vehicleManagement;

    private VehicleManagement getVehicleManagement()
    {
        return this.repository.getAll().listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = VehicleManagementRepositoryImpl.getRepository();
        this.vehicleManagement = VehicleManagementFactory.getDetails("XTO7", "Vehicle is Managed in Cape Town");
    }

    @Test
    public void getAll()
    {
        List<VehicleManagement> vehicleManagementList = this.repository.getAll();
        System.out.println("Getting Vehicle Management Details...\n" + vehicleManagementList);
    }

    @Test
    public void create()
    {
        VehicleManagement toCreate = this.repository.create(this.vehicleManagement);
        System.out.println("Creating Vehicle Management...\n" + toCreate);

        Assert.assertNotNull(toCreate);
        Assert.assertSame(toCreate, this.vehicleManagement);
    }

    @Test
    public void read()
    {
        VehicleManagement toRead = getVehicleManagement();
        VehicleManagement read = this.repository.read(toRead.getVehicleId());

        System.out.println("Reading Vehicle Management Details...\n" + read);
        Assert.assertSame(toRead, read);
    }

    @Test
    public void update()
    {
        String details = "Vehicle is well Managed and Maintained In Cape Town";

        VehicleManagement toUpdate = new VehicleManagement.Builder().copyVM(getVehicleManagement()).details(details).build();
        this.repository.update(toUpdate);

        Assert.assertSame(details, toUpdate.getVehicleDetails());
    }

    @Ignore
    @Test
    public void delete()
    {
        VehicleManagement toDelete = getVehicleManagement();

        this.repository.delete(toDelete.getVehicleId());
    }
}