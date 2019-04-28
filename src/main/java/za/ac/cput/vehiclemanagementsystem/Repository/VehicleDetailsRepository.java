package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleDetails;

import java.util.Set;

public interface VehicleDetailsRepository extends ControlRepository<VehicleDetails, String>
{
    Set <VehicleDetails> getAll();
}

