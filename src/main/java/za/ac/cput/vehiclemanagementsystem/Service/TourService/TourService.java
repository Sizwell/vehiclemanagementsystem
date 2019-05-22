package za.ac.cput.vehiclemanagementsystem.Service.TourService;

import za.ac.cput.vehiclemanagementsystem.Domain.Tour.Tour;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.Set;

public interface TourService extends ControlService<Tour, String>
{
    Set<Tour> getAll();
}
