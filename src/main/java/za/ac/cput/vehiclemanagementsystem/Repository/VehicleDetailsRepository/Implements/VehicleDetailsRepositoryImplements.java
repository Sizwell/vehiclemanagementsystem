package za.ac.cput.vehiclemanagementsystem.Repository.VehicleDetailsRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleDetails.VehicleDetails;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleDetailsRepository.VehicleDetailsRepository;

import java.util.HashSet;
import java.util.Set;

public class VehicleDetailsRepositoryImplements implements VehicleDetailsRepository {

    private static VehicleDetailsRepositoryImplements vehicleDetailsRepo = null;
    private Set<VehicleDetails> vehicleDetailsSet;

    private VehicleDetailsRepositoryImplements()
    {
       this.vehicleDetailsSet = new HashSet<>();
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
        return this.vehicleDetailsSet;
    }

    @Override
    public VehicleDetails create(VehicleDetails vehicleDetails)
    {
        this.vehicleDetailsSet.add(vehicleDetails);
        return vehicleDetails;
    }

    @Override
    public VehicleDetails read(String s) {
        return null;
    }

    @Override
    public VehicleDetails update(VehicleDetails vehicleDetails) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
