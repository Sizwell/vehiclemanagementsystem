package za.ac.cput.vehiclemanagementsystem.Repository.ServiceRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Service.Service;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface ServiceRepository extends ControlRepository<Service, String>
{
    List <Service> getAll();
}
