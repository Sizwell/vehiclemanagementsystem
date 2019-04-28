package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Minibus;

public class MinibusFactory {

    public static Minibus getMyMinibus(String vin, int drNo, int capacity) {
        return new Minibus.Builder()
                .vinNo(vin)
                .driverNum(drNo)
                .capacity(capacity)
                .build();
    }

}
