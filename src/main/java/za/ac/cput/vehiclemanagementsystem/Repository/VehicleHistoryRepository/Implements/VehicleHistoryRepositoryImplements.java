package za.ac.cput.vehiclemanagementsystem.Repository.VehicleHistoryRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.TrafficViolations.TrafficViolations;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicle;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleHistory.VehicleHistory;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleHistoryRepository.VehicleHistoryRepository;

import java.util.ArrayList;
import java.util.List;

public class VehicleHistoryRepositoryImplements implements VehicleHistoryRepository {

    private static VehicleHistoryRepositoryImplements repository = null;
    private List<VehicleHistory> vehicleHistoryList;

    private VehicleHistoryRepositoryImplements()
    {
        this.vehicleHistoryList = new ArrayList<>();
    }

    private VehicleHistory findVehicleHistory(String vHistory)
    {
        return this.vehicleHistoryList.stream().filter(vehicleHistory -> vehicleHistory.getVehicleNo()
        .trim().equals(vHistory))
                .findAny()
                .orElse(null);
    }

    public static VehicleHistoryRepositoryImplements getRepository()
    {
        if (repository == null)
        {
            repository = new VehicleHistoryRepositoryImplements();

        }
        return repository;
    }

    @Override
    public List<VehicleHistory> getHistory() {
        return this.vehicleHistoryList;
    }

    @Override
    public VehicleHistory create(VehicleHistory vehicleHistory) {

        this.vehicleHistoryList.add(vehicleHistory);
        return vehicleHistory;
    }

    @Override
    public VehicleHistory read(String s)
    {
        VehicleHistory read = findVehicleHistory(s);
        return read;
    }

    @Override
    public VehicleHistory update(VehicleHistory vehicleHistory)
    {
        VehicleHistory toUpdate = findVehicleHistory(vehicleHistory.getVehicleNo());
        if (toUpdate != null)
        {
            this.vehicleHistoryList.remove(toUpdate);
            return create(vehicleHistory);
        }
        return null;
    }

    @Override
    public void delete(String s)
    {
        VehicleHistory toDelete = findVehicleHistory(s);
        if (toDelete != null)
        {
            this.vehicleHistoryList.remove(toDelete);
        }
    }
}
