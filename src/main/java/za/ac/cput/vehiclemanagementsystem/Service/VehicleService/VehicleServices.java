package za.ac.cput.vehiclemanagementsystem.Service.VehicleService;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleService.VehicleService;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.List;

public interface VehicleServices extends ControlService <VehicleService, String>
{
    List <VehicleService> getAll();
}
