package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.UpdateVehicle;

public class UpdateVehicleFactory {

    public static UpdateVehicle vehicleUpdate(String vin, String make, String model)
    {
        return new UpdateVehicle.Builder()
                .vinNo(vin)
                .make(make)
                .model(model)
                .build();
    }
}
