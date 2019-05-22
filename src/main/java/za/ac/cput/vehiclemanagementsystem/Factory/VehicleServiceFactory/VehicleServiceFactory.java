package za.ac.cput.vehiclemanagementsystem.Factory.VehicleServiceFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleService.VehicleService;

public class VehicleServiceFactory {

    public static VehicleService getService(String vin, String make, String model) {
        return new VehicleService.Builder()
                .vinNo(vin)
                .make(make)
                .model(model)
                .build();
    }
}
