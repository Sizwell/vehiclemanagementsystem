package za.ac.cput.vehiclemanagementsystem.Repository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Service;
import za.ac.cput.vehiclemanagementsystem.Repository.ServiceRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ServiceRepositoryImplements implements ServiceRepository {
    
    private static ServiceRepositoryImplements serviceRepo = null;
    private List<Service> serviceList;
    
    private ServiceRepositoryImplements()
    {
        this.serviceList = new ArrayList<>();
    }
    
    public static ServiceRepository getService()
    {
        if(serviceRepo == null)
        {
            serviceRepo = new ServiceRepositoryImplements();
        }
        return serviceRepo;
    }    
    
    @Override
    public List<Service> getAll() 
    {
        return this.serviceList;
    }

    @Override
    public Service create(Service service) 
    {
        this.serviceList.add(service);
        return service;
    }

    @Override
    public Service read(String s) {
        return null;
    }

    @Override
    public Service update(Service service) {
        return null;
    }

    @Override
    public void delete(String s) 
    {

    }
}
