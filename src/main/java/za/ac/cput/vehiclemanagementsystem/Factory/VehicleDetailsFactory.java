package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleDetails;

public class VehicleDetailsFactory {

    public static VehicleDetails getDetails(String reg, String type)
    {
        return new VehicleDetails.Builder()
                .vehicleReg(reg)
                .vehType(type)
                .build();
    }
}
