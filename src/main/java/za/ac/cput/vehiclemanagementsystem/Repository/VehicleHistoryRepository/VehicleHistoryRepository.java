package za.ac.cput.vehiclemanagementsystem.Repository.VehicleHistoryRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleHistory.VehicleHistory;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface VehicleHistoryRepository extends ControlRepository {
    List <VehicleHistory> getHistory();
}
