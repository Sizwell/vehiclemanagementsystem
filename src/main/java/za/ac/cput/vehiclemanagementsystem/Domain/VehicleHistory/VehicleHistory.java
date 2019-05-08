package za.ac.cput.vehiclemanagementsystem.Domain.VehicleHistory;

import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicle;

public class VehicleHistory {

    private String vehicleNo;
    private String veihcleType;
    private String history;

    public VehicleHistory()
    {

    }

    public VehicleHistory(Builder builder)
    {
       this.vehicleNo = builder.vehicleNo;
       this.veihcleType = builder.veihcleType;
       this.history = builder.history;
    }

    public static class Builder
    {
        private String vehicleNo;
        private String veihcleType;
        private String history;

        public Builder vehNo(String num)
        {
            this.vehicleNo = num;
            return this;
        }

        public Builder vehType(String type)
        {
            this.veihcleType = type;
            return this;
        }

        public Builder vehHistory(String history)
        {
            this.history = history;
            return this;
        }

        public VehicleHistory build()
        {
            return new VehicleHistory(this);
        }
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public String getVeihcleType() {
        return veihcleType;
    }

    public String getHistory() {
        return history;
    }

    @Override
    public String toString() {
        return "------ Vehicle History ------\n" +
                "Vehicle No: '" + getVehicleNo() + '\'' +
                "\nVehicle Type: '" + getVeihcleType() + '\'' +
                "\nHistory: '" + getHistory() + '\'';
    }
}
