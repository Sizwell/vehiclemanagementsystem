package za.ac.cput.vehiclemanagementsystem.repository.VehicleManagementRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicle;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement.VehicleManagement;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleManagementFactory.VehicleManagementFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleManagementRepository.Implements.VehicleManagementRepositoryImpl;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleManagementRepository.VehicleManagementRepo;

import java.util.List;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VehicleManagementRepositoryImplTest {

    private VehicleManagementRepo repository;
    private VehicleManagement vm;

    private VehicleManagement getManagement()
    {
        List <VehicleManagement> vehicleManagementList = this.repository.getAll();
        return vehicleManagementList.listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = VehicleManagementRepositoryImpl.getRepository();
        this.vm = VehicleManagementFactory.getDetails("CA-783-607", "22 Seater Mercedese benze Crafter");
    }


    @Test
    public void getAll()
    {
        List <VehicleManagement> all = this.repository.getAll();
        System.out.println("....All Management....\n" + all);
    }

    @Test
    public void create()
    {
        VehicleManagement vehicleManagement = this.repository.create(this.vm);
        System.out.println("Managing Vehicles...\n" + vehicleManagement);

        getAll();
        Assert.assertSame(vehicleManagement, this.vm);
    }

    @Test
    public void read()
    {
        VehicleManagement management = getManagement();
        System.out.println("Getting Vehicle Management...\n" + management.getVehicleId());

        VehicleManagement read = this.repository.read(management.getVehicleId());
        System.out.println("Reading Vehicle Managements");

        getAll();
        Assert.assertEquals(management, read);
    }

    @Test
    public void update()
    {
        String details = "22 - Seater VW Crafter";

        VehicleManagement vehicleManagement = new VehicleManagement.Builder().copyVM(getManagement()).details(details)
                .build();
        System.out.println("Vehicle Details have been Updated...\n" + vehicleManagement);

        VehicleManagement update = this.repository.update(vehicleManagement);
        System.out.println("Updated Vehicle Details...\n" + update);

        Assert.assertSame(details, update.getVehicleDetails());
    }

    @Ignore
    @Test
    public void delete()
    {
        VehicleManagement toDelete = getManagement();
        this.repository.delete(toDelete.getVehicleId());
        getAll();
    }
}