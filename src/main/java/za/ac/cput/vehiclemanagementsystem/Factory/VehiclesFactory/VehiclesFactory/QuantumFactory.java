package za.ac.cput.vehiclemanagementsystem.Factory.VehiclesFactory.VehiclesFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicles.Quantum;

public class QuantumFactory {

    public static Quantum getMyQuantum(String vin, int drNo, int capacity) {
        return new Quantum.Builder()
                .vinNo(vin)
                .driverNum(drNo)
                .capacity(capacity)
                .build();
    }

}
