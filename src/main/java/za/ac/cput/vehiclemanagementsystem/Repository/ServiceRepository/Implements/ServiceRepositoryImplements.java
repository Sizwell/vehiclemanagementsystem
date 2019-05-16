package za.ac.cput.vehiclemanagementsystem.Repository.ServiceRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Service.Service;
import za.ac.cput.vehiclemanagementsystem.Repository.ServiceRepository.ServiceRepository;

import java.util.ArrayList;
import java.util.List;

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

    private Service findService(String serviceID)
    {
        return this.serviceList.stream().filter(service -> service.getVinNo().trim().equals(serviceID))
                .findAny()
                .orElse(null);
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
    public Service read(String s)
    {
        Service service = findService(s);

        return service;
    }

    @Override
    public Service update(Service service)
    {
        Service serviceUpdate = findService(service.getVinNo());
        if (serviceUpdate != null)
        {
            this.serviceList.remove(serviceUpdate);
            return create(service);
        }
        return null;
    }

    @Override
    public void delete(String s) 
    {
        Service toDelete = findService(s);
        if (toDelete != null)
        {
            this.serviceList.remove(toDelete);
        }
    }
}
