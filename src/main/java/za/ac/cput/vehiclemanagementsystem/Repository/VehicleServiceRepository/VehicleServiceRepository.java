package za.ac.cput.vehiclemanagementsystem.Repository.VehicleServiceRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleService.VehicleService;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface VehicleServiceRepository extends ControlRepository<VehicleService, String>
{
    List <VehicleService> getAll();
}
