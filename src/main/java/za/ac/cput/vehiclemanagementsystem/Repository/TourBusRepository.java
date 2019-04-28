package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.TourBus;

import java.util.List;

public interface TourBusRepository extends ControlRepository <TourBus, String>
{
    List<TourBus> getAll();
}
