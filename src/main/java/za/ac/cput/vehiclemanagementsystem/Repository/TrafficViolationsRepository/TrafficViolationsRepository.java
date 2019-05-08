package za.ac.cput.vehiclemanagementsystem.Repository.TrafficViolationsRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.TrafficViolations.TrafficViolations;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface TrafficViolationsRepository extends ControlRepository<TrafficViolations, String>
{
    List <TrafficViolations> getAll();
}
