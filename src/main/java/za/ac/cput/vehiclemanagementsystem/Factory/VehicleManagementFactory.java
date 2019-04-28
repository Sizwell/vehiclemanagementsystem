package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement;

public class VehicleManagementFactory {

    public static VehicleManagement getDetails(String details) {
        return new VehicleManagement.Builder()
                .details(details).build();
    }
}
