package za.ac.cput.vehiclemanagementsystem.Repository.VehiclesRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicle;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.Set;

public interface VehicleRepository extends ControlRepository<Vehicle, String>
{
    Set<Vehicle> getAll();
}
