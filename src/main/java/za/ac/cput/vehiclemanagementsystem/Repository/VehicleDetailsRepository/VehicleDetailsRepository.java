package za.ac.cput.vehiclemanagementsystem.Repository.VehicleDetailsRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleDetails.VehicleDetails;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.Set;

public interface VehicleDetailsRepository extends ControlRepository<VehicleDetails, String>
{
    Set <VehicleDetails> getAll();
}

