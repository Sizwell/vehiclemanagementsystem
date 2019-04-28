package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle;

public class VehicleFactory {

    public static Vehicle getVehicles(String vin, String type, String details) {
        return new Vehicle.Builder()
                .vinNo(vin)
                .vehType(type)
                .vehDetails(details)
                .build();
    }

}
