package za.ac.cput.vehiclemanagementsystem.Service.RoutesService;

import za.ac.cput.vehiclemanagementsystem.Domain.Routes.Routes;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.Set;

public interface RoutesService extends ControlService<Routes, Integer>
{
     Set<Routes> getAll();
}
