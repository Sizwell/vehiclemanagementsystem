package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.Deductions;
import za.ac.cput.vehiclemanagementsystem.Domain.Routes;

import java.util.Set;

public interface RoutesRepository extends ControlRepository <Routes, Integer>
{
    Set <Routes> getAll();
}
