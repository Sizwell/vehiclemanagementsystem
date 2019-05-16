package za.ac.cput.vehiclemanagementsystem.Factory.VehicleManagementFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement.VehicleManagement;

public class VehicleManagementFactory {

    public static VehicleManagement getDetails(String vID,String details) {
        return new VehicleManagement.Builder()
                .vehicleID(vID)
                .details(details).build();
    }
}
