package za.ac.cput.vehiclemanagementsystem.Service.TrackerService;

import za.ac.cput.vehiclemanagementsystem.Domain.Tracker.Tracker;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.List;

public interface TrackerService extends ControlService <Tracker, String>
{
    List<Tracker> getAll();
}
