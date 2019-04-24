package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Cab;

public class CabFactory {

    public static Cab getCab(String vin, String vehType, String driverName)
    {
        return new Cab.Builder()
                .vinNumber(vin)
                .vehicleType(vehType)
                .driverName(driverName)
                .build();
    }

}
