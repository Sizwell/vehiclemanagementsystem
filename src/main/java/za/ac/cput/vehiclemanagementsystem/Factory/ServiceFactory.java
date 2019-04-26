package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Service;

public class ServiceFactory {

    public static Service getService(String vin, String make, String model)
    {
        return new Service.Builder()
                .vinNo(vin)
                .make(make)
                .model(model)
                .build();
    }
}
