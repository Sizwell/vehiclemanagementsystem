package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.RegisterVehicle;

public class RegisterVehicleFactory {

    public static RegisterVehicle getRegistration(String vin, String make, String model)
    {
        return new RegisterVehicle.Builder()
                .vinNo(vin)
                .make(make)
                .model(model)
                .build();
    }
}
