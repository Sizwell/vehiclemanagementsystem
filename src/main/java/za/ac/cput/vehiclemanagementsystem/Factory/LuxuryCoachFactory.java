package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.LuxuryCoach;

public class LuxuryCoachFactory {

    public static LuxuryCoach getMyLuxuryCoach(String vin, int drNo, int capacity)
    {
        return new LuxuryCoach.Builder()
                .vinNo(vin)
                .driverNum(drNo)
                .capacity(capacity)
                .build();
    }

}
