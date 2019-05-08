package za.ac.cput.vehiclemanagementsystem.Factory.VehicleHistoryFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleHistory.VehicleHistory;

public class VehicelHistoryFactory {

    public static VehicleHistory vehicleHistory(String vNum, String vType, String vHistory)
    {
        return new VehicleHistory.Builder()
                .vehNo(vNum)
                .vehType(vType)
                .vehHistory(vHistory)
                .build();
    }

}
