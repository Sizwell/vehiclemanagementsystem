package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle;

import java.util.Set;

public interface VehicleRepository extends ControlRepository <Vehicle, String>
{
    Set<Vehicle> getAll();
}
