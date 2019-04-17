package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.RemoveVehicle;

public class RemoveVehicleFactory {

    public static RemoveVehicle getRemovedVehicleDetails(String vin, String model)
    {
        return new RemoveVehicle.Builder()
                .vinNo(vin)
                .model(model)
                .build();
    }
}
