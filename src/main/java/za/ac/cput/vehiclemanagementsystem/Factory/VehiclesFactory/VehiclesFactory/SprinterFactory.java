package za.ac.cput.vehiclemanagementsystem.Factory.VehiclesFactory.VehiclesFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicles.Sprinter;

public class SprinterFactory {

    public static Sprinter getSprinter(String vin, int drNo, int capacity) {
        return new Sprinter.Builder()
                .vinNo(vin)
                .driverNum(drNo)
                .capacity(capacity)
                .build();
    }

}
