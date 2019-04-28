package za.ac.cput.vehiclemanagementsystem.Repository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleManagementRepo;

import java.util.ArrayList;
import java.util.List;


public class VehicleManagementRepositoryImpl implements VehicleManagementRepo {


    private static VehicleManagementRepositoryImpl vehicleRepository = null;
    private List<VehicleManagement> vehicles;


    private VehicleManagementRepositoryImpl() {
        this.vehicles = new ArrayList<>();
    }

    public static VehicleManagementRepo getRepository() {
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
    public VehicleManagement create(VehicleManagement creating) {
        /*vehicleRepository.vehicles.add(creating);
        int a = vehicles.g*/
        this.vehicles.add(creating);
        return creating;
    }

    @Override
    public VehicleManagement read(String reader)
    {
        int i = vehicles.indexOf(reader);
        return vehicleRepository.vehicles.get(i);
    }

    @Override
    public VehicleManagement update(VehicleManagement updater)
    {
        vehicles.add(updater);
        vehicleRepository.update(updater);
        return updater;
    }

    @Override
    public void delete(String delete)
    {
        vehicles.remove(delete);
    }
}
