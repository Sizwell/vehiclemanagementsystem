package za.ac.cput.vehiclemanagementsystem.Service.VehicleManagementService.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement.VehicleManagement;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleManagementRepository.Implements.VehicleManagementRepositoryImpl;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleManagementRepository.VehicleManagementRepo;
import za.ac.cput.vehiclemanagementsystem.Service.VehicleManagementService.VehicleManagementService;

import java.util.List;

@Service
public class VehicleManagementServiceImpl implements VehicleManagementService {

    @Autowired
   //@Qualifier("InMemory")

    private VehicleManagementServiceImpl service = null;
    private VehicleManagementRepo repo;

    private VehicleManagementServiceImpl()
    {
        this.repo = VehicleManagementRepositoryImpl.getRepository();
    }

    @Override
    public List<VehicleManagement> getAll() {
        return this.repo.getAll();
    }

    @Override
    public VehicleManagement create(VehicleManagement vehicleManagement)
    {
        return this.repo.create(vehicleManagement);
    }

    @Override
    public VehicleManagement read(String s) {
        return this.repo.read(s);
    }

    @Override
    public VehicleManagement update(VehicleManagement vehicleManagement) {
        return this.repo.update(vehicleManagement);
    }

    @Override
    public void delete(String s)
    {
        this.repo.delete(s);
    }
}
