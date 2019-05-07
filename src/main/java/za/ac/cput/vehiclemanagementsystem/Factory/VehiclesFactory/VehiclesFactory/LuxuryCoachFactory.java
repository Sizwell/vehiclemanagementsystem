package za.ac.cput.vehiclemanagementsystem.Factory.VehiclesFactory.VehiclesFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicles.LuxuryCoach;

public class LuxuryCoachFactory {

    public static LuxuryCoach getMyLuxuryCoach(String vin, int drNo, int capacity) {
        return new LuxuryCoach.Builder()
                .vinNo(vin)
                .driverNum(drNo)
                .capacity(capacity)
                .build();
    }

}
