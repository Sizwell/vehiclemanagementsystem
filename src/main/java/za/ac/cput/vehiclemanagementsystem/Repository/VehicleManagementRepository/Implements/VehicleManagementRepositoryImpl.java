package za.ac.cput.vehiclemanagementsystem.Repository.VehicleManagementRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicle;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement.VehicleManagement;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleManagementRepository.VehicleManagementRepo;

import java.util.ArrayList;
import java.util.List;


@Repository

public class VehicleManagementRepositoryImpl implements VehicleManagementRepo {


    private static VehicleManagementRepositoryImpl vehicleRepository = null;
    private List<VehicleManagement> vehicles;


    private VehicleManagementRepositoryImpl() {
        this.vehicles = new ArrayList<>();
    }

    private VehicleManagement manageVehicles(String id)
    {
        return this.vehicles.stream().filter(vehicleManagement -> vehicleManagement.getVehicleId().trim().equals(id))
                .findAny()
                .orElse(null);
    }

    public static VehicleManagementRepositoryImpl getRepository() {
        if (vehicleRepository == null) {
            vehicleRepository = new VehicleManagementRepositoryImpl();
        }
        return vehicleRepository;
    }

    @Override
    public List<VehicleManagement> getAll() {
        return this.vehicles;
    }

    @Override
    public VehicleManagement create(VehicleManagement vm)
    {
        this.vehicles.add(vm);
        return vm;
    }

    @Override
    public VehicleManagement read(String reader)
    {
        VehicleManagement management = manageVehicles(reader);
        return management;
    }

    @Override
    public VehicleManagement update(VehicleManagement updater)
    {
        VehicleManagement toUpdate = manageVehicles(updater.getVehicleId());
        if (toUpdate != null)
        {
            this.vehicles.remove(toUpdate);
            return create(updater);
        }
        return null;
    }

    @Override
    public void delete(String delete)
    {
        VehicleManagement toDelete = manageVehicles(delete);
        if (toDelete != null){
            this.vehicles.remove(toDelete);
        }
    }
}
