package za.ac.cput.vehiclemanagementsystem.Domain.VehicleHistory;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicle;

import java.util.Objects;
@EntityScan
public class VehicleHistory {

    private String historyNo;
    private String vehicleType;
    private String history;

    public VehicleHistory()
    {

    }

    public VehicleHistory(Builder builder)
    {
       this.historyNo = builder.historyNo;
       this.vehicleType = builder.vehicleType;
       this.history = builder.history;
    }

    public static class Builder
    {
        private String historyNo;
        private String vehicleType;
        private String history;

        public Builder historyNo(String num)
        {
            this.historyNo = num;
            return this;
        }

        public Builder vehType(String type)
        {
            this.vehicleType = type;
            return this;
        }

        public Builder vehHistory(String history)
        {
            this.history = history;
            return this;
        }
        
        public Builder copyVH(VehicleHistory vehicleHistory)
        {
            this.historyNo = vehicleHistory.historyNo;
            this.vehicleType = vehicleHistory.vehicleType;
            this.history = vehicleHistory.history;

            return this;
        }

        public VehicleHistory build()
        {
            return new VehicleHistory(this);
        }
    }

    public String getHistoryNo() {
        return historyNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getHistory() {
        return history;
    }

    @Override
    public String toString() {
        return "------ Vehicle History ------\n" +
                "Vehicle No: '" + getHistoryNo() + '\'' +
                "\nVehicle Type: '" + getVehicleType() + '\'' +
                "\nHistory: '" + getHistory() + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehicleHistory)) return false;
        VehicleHistory that = (VehicleHistory) o;
        return historyNo.equals(that.historyNo) &&
                Objects.equals(vehicleType, that.vehicleType) &&
                history.equals(that.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historyNo, vehicleType, history);
    }
}
