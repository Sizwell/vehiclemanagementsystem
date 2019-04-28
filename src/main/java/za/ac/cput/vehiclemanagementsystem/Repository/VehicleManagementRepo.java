package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement;

import java.util.List;

public interface VehicleManagementRepo extends ControlRepository<VehicleManagement, String> {
    List<VehicleManagement> getAll();
}
