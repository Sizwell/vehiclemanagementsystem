package za.ac.cput.vehiclemanagementsystem.Repository.TourRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Tour.Tour;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.Set;

public interface TourRepository extends ControlRepository <Tour, String>
{
    Set <Tour> getAll();
}
