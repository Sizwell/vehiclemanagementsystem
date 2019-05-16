package za.ac.cput.vehiclemanagementsystem.repository.ServiceRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.omg.CORBA.portable.ServantObject;
import za.ac.cput.vehiclemanagementsystem.Factory.ServiceFactory.ServiceFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.ServiceRepository.Implements.ServiceRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.ServiceRepository.ServiceRepository;
import za.ac.cput.vehiclemanagementsystem.Domain.Service.Service;

import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ServiceRepositoryImplementsTest {

    private ServiceRepository repository;
    private Service service;


    private Service getService()
    {
        List<Service> serviceList = this.repository.getAll();
        return serviceList.listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = ServiceRepositoryImplements.getService();
        this.service = ServiceFactory.getService("TY790VBAS4", "Luxury Coach", "Comfort Line");
    }

    @Test
    public void create()
    {
        Service serviceCreate = this.repository.create(this.service);
        System.out.println("Creating a Service...\n" + serviceCreate);
        getAll();
        Assert.assertSame(serviceCreate, this.service);
    }

    @Test
    public void read()
    {
        Service readingService = getService();
        System.out.println("Reading a Service...\n" + readingService.getVinNo());

        Service read = this.repository.read(readingService.getVinNo());
        getAll();

        Assert.assertEquals(readingService, read);
    }

    @Test
    public void update()
    {
        String serviceName = "Comfort Line Cross";
        Service serviceUpdate = new Service.Builder().copyVin(getService()).model(serviceName).build();
        System.out.println("Updating Vehicle Service\n");

        Service updated = this.repository.update(serviceUpdate);
        System.out.println("Vehicle Service has been Updated...\n");

        Assert.assertNotEquals(serviceUpdate, updated.getModel());

        getAll();
    }

    @Ignore
    @Test
    public void delete()
    {
        Service toDelete = getService();
        this.repository.delete(toDelete.getVinNo());
        getAll();
    }

    public void getAll()
    {
        List <Service> services = this.repository.getAll();
        System.out.println("Getting All Services...\n");
    }
}