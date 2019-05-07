package za.ac.cput.vehiclemanagementsystem.Repository.RoutesRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Routes.Routes;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.Set;

public interface RoutesRepository extends ControlRepository<Routes, Integer>
{
    Set <Routes> getAll();
}
