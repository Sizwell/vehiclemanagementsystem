package za.ac.cput.vehiclemanagementsystem.Service.VehicleService.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleService.VehicleService;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleServiceRepository.Implements.VehicleServiceRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleServiceRepository.VehicleServiceRepository;
import za.ac.cput.vehiclemanagementsystem.Service.VehicleService.VehicleServices;

import java.util.List;

@Service
public class VehicleServicesImpl implements VehicleServices {

    @Autowired
    @Qualifier("InMemory")

    private static VehicleServicesImpl services = null;
    private VehicleServiceRepository repository;

    private VehicleServicesImpl()
    {
        this.repository = VehicleServiceRepositoryImplements.getService();
    }

    @Override
    public List<VehicleService> getAll()
    {
        return this.repository.getAll();
    }

    public static VehicleServicesImpl getServices()
    {
        if (services == null)
        {
            services = new VehicleServicesImpl();
        }
        return services;
    }

    @Override
    public VehicleService create(VehicleService vehicleService) {
        return this.repository.create(vehicleService);
    }

    @Override
    public VehicleService read(String s) {
        return this.repository.read(s);
    }

    @Override
    public VehicleService update(VehicleService vehicleService) {
        return this.repository.update(vehicleService);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }
}
