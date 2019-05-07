package za.ac.cput.vehiclemanagementsystem.Repository.VehiclesRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicle;
import za.ac.cput.vehiclemanagementsystem.Repository.VehiclesRepository.VehicleRepository;

import java.util.HashSet;
import java.util.Set;

public class VehicleRepositoryImplements  implements VehicleRepository {

    private static VehicleRepositoryImplements vehiclesRepo = null;
    private Set<Vehicle> vehicleSet;

    private VehicleRepositoryImplements()
    {
        this.vehicleSet = new HashSet<>();
    }

    public static VehicleRepository getVehicle()
    {
        if(vehiclesRepo == null)
        {
            vehiclesRepo = new VehicleRepositoryImplements();
        }
        return vehiclesRepo;
    }

    @Override
    public Set<Vehicle> getAll()
    {
        return this.vehicleSet;
    }

    @Override
    public Vehicle create(Vehicle vehicle)
    {
        this.vehicleSet.add(vehicle);
        return vehicle;
    }

    @Override
    public Vehicle read(String s) {
        return null;
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
