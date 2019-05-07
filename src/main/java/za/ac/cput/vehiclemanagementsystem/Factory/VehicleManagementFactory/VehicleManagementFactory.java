package za.ac.cput.vehiclemanagementsystem.Factory.VehicleManagementFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement.VehicleManagement;

public class VehicleManagementFactory {

    public static VehicleManagement getDetails(String details) {
        return new VehicleManagement.Builder()
                .details(details).build();
    }
}
