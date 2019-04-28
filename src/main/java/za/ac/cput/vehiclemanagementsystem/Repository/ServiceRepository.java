package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.Service;

import java.util.List;

public interface ServiceRepository extends ControlRepository <Service, String>
{
    List <Service> getAll();
}
