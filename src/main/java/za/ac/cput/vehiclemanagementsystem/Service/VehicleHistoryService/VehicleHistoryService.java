package za.ac.cput.vehiclemanagementsystem.Service.VehicleHistoryService;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleHistory.VehicleHistory;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.List;

public interface VehicleHistoryService extends ControlService <VehicleHistory, String>
{
    List<VehicleHistory> getAll();
}
