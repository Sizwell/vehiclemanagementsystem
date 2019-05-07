package za.ac.cput.vehiclemanagementsystem.Repository.TrackerRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Tracker.Tracker;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface TrackerRepository extends ControlRepository<Tracker, String>
{
    List <Tracker> getAll();
}
