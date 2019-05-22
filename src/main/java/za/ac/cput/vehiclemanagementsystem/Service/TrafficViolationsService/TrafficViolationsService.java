package za.ac.cput.vehiclemanagementsystem.Service.TrafficViolationsService;

import za.ac.cput.vehiclemanagementsystem.Domain.TrafficViolations.TrafficViolations;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.List;

public interface TrafficViolationsService extends ControlService <TrafficViolations, String>
{
    List<TrafficViolations> getAll();
}
