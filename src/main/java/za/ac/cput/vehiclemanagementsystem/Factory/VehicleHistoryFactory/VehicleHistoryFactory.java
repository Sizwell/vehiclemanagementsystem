package za.ac.cput.vehiclemanagementsystem.Factory.VehicleHistoryFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.VehicleHistory.VehicleHistory;

public class VehicleHistoryFactory {

    public static VehicleHistory vehicleHistory(String histNum, String vType, String vHistory)
    {
        return new VehicleHistory.Builder()
                .historyNo(histNum)
                .vehType(vType)
                .vehHistory(vHistory)
                .build();
    }

}
