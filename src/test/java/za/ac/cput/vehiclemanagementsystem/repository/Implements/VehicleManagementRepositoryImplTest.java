package za.ac.cput.vehiclemanagementsystem.repository.Implements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleManagementFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.Implements.VehicleManagementRepositoryImpl;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleManagementRepo;

import static org.junit.Assert.*;

public class VehicleManagementRepositoryImplTest {

    private VehicleManagementRepo repository;
    private VehicleManagement vm;

    @Before
    public void setUp() throws Exception
    {
        this.repository = VehicleManagementRepositoryImpl.getRepository();
        this.vm = VehicleManagementFactory.getDetails("32-seater coach");
    }

    @Test
    public void getRepository()
    {
        Assert.assertEquals(repository.getAll(), repository.toString());
    }

    @Test
    public void getAll()
    {
        Assert.assertEquals(repository.getAll(), repository.getAll());
    }

    @Test
    public void create()
    {
        this.repository.create(vm);
        Assert.assertEquals( repository.create(vm), repository.update(vm));
    }

    @Test
    public void read()
    {
        Assert.assertEquals(repository.getAll(), repository.read("514"));
    }

    @Test
    public void update()
    {
        Assert.assertEquals(repository.getAll(), repository.update(vm));
    }

    @Test
    public void delete()
    {
        repository.delete(vm.getVehicleDetails());
    }
}