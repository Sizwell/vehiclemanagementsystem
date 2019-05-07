package za.ac.cput.vehiclemanagementsystem.Repository.VehiclesRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicles.TourBus;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface TourBusRepository extends ControlRepository<TourBus, String>
{
    List<TourBus> getAll();
}
