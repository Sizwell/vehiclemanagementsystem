package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.Tracker;

import java.util.List;

public interface TrackerRepository extends ControlRepository <Tracker, String>
{
    List <Tracker> getAll();
}
