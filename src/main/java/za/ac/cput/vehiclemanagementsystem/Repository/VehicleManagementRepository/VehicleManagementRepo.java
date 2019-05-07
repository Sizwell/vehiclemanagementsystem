package za.ac.cput.vehiclemanagementsystem.Repository.VehicleManagementRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement.VehicleManagement;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface VehicleManagementRepo extends ControlRepository<VehicleManagement, String> {
    List<VehicleManagement> getAll();
}
