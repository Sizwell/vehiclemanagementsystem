package za.ac.cput.vehiclemanagementsystem.Factory.LicenseDisk;

import za.ac.cput.vehiclemanagementsystem.Domain.LicenseDisk.LicenseDisk;

public class LicenseDiskFactory {

    public static LicenseDisk getVehicleRegistration(String reg, String model)
    {
        return new LicenseDisk.Builder()
                .registrationNum(reg)
                .model(model)
                .build();
    }
}
