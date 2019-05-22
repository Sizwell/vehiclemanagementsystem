package za.ac.cput.vehiclemanagementsystem.Service.VehicleManagementService;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement.VehicleManagement;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface VehicleManagementService extends ControlRepository<VehicleManagement, String>
{
    List<VehicleManagement> getAll();
}
