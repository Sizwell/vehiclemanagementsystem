package za.ac.cput.vehiclemanagementsystem.Factory.VehicleDetailsFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleDetails.VehicleDetails;

public class VehicleDetailsFactory {

    public static VehicleDetails getDetails(String reg, String type) {
        return new VehicleDetails.Builder()
                .vehicleReg(reg)
                .vehType(type)
                .build();
    }
}
