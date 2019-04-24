package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Sprinter;

public class SprinterFactory {

    public static Sprinter getSprinter(String vin, int drNo, int capacity)
    {
        return new Sprinter.Builder()
                .vinNo(vin)
                .driverNum(drNo)
                .capacity(capacity)
                .build();
    }

}
