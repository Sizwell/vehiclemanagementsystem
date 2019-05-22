package za.ac.cput.vehiclemanagementsystem.Repository.VehicleDetailsRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleDetails.VehicleDetails;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleDetailsRepository.VehicleDetailsRepository;

import java.util.*;

@Repository

public class VehicleDetailsRepositoryImplements implements VehicleDetailsRepository {

    private static VehicleDetailsRepositoryImplements vehicleDetailsRepo = null;
    private Map<String, VehicleDetails> vehicleDetailsMap;

    private VehicleDetailsRepositoryImplements()
    {
       this.vehicleDetailsMap = new HashMap<>();
    }

    public static VehicleDetailsRepository getVehicleDetails()
    {
        if(vehicleDetailsRepo == null)
        {
            vehicleDetailsRepo = new VehicleDetailsRepositoryImplements();
        }
        return vehicleDetailsRepo;
    }

    @Override
    public Set<VehicleDetails> getAll()
    {
        Collection <VehicleDetails> vehicleDetailsCollection = this.vehicleDetailsMap.values();
        Set<VehicleDetails> vehicleDetailsSet = new HashSet<>();
        vehicleDetailsSet.addAll(vehicleDetailsCollection);
        return vehicleDetailsSet;
    }

    @Override
    public VehicleDetails create(VehicleDetails vehicleDetails)
    {
        this.vehicleDetailsMap.put(vehicleDetails.getVehicleReg(), vehicleDetails);
        return vehicleDetails;
    }

    @Override
    public VehicleDetails read(String s)
    {
        return this.vehicleDetailsMap.get(s);
    }

    @Override
    public VehicleDetails update(VehicleDetails vehicleDetails)
    {
        this.vehicleDetailsMap.replace(vehicleDetails.getVehicleReg(), vehicleDetails);
        return this.vehicleDetailsMap.get(vehicleDetails.getVehicleReg());
    }

    @Override
    public void delete(String s)
    {
        this.vehicleDetailsMap.remove(s);
    }
}
