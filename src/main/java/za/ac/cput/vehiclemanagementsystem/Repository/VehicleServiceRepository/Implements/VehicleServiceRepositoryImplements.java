package za.ac.cput.vehiclemanagementsystem.Repository.VehicleServiceRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleService.VehicleService;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleServiceRepository.VehicleServiceRepository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class VehicleServiceRepositoryImplements implements VehicleServiceRepository {
    
    private static VehicleServiceRepositoryImplements serviceRepo = null;
    private List<VehicleService> vehicleServiceList;
    
    private VehicleServiceRepositoryImplements()
    {
        this.vehicleServiceList = new ArrayList<>();
    }
    
    public static VehicleServiceRepositoryImplements getService()
    {
        if(serviceRepo == null)
        {
            serviceRepo = new VehicleServiceRepositoryImplements();
        }
        return serviceRepo;
    }

    private VehicleService findService(String serviceID)
    {
        return this.vehicleServiceList.stream().filter(service -> service.getVinNo().trim().equals(serviceID))
                .findAny()
                .orElse(null);
    }
    
    @Override
    public List<VehicleService> getAll()
    {
        return this.vehicleServiceList;
    }

    @Override
    public VehicleService create(VehicleService vehicleService)
    {
        this.vehicleServiceList.add(vehicleService);
        return vehicleService;
    }

    @Override
    public VehicleService read(String s)
    {
        VehicleService vehicleService = findService(s);

        return vehicleService;
    }

    @Override
    public VehicleService update(VehicleService vehicleService)
    {
        VehicleService vehicleServiceUpdate = findService(vehicleService.getVinNo());
        if (vehicleServiceUpdate != null)
        {
            this.vehicleServiceList.remove(vehicleServiceUpdate);
            return create(vehicleService);
        }
        return null;
    }

    @Override
    public void delete(String s) 
    {
        VehicleService toDelete = findService(s);
        if (toDelete != null)
        {
            this.vehicleServiceList.remove(toDelete);
        }
    }
}
