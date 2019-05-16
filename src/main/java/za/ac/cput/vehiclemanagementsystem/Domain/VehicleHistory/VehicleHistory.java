package za.ac.cput.vehiclemanagementsystem.Domain.VehicleHistory;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicle;

import java.util.Objects;
@EntityScan
public class VehicleHistory {

    private String vehicleNo;
    private String vehicleType;
    private String history;

    public VehicleHistory()
    {

    }

    public VehicleHistory(Builder builder)
    {
       this.vehicleNo = builder.vehicleNo;
       this.vehicleType = builder.vehicleType;
       this.history = builder.history;
    }

    public static class Builder
    {
        private String vehicleNo;
        private String vehicleType;
        private String history;

        public Builder vehNo(String num)
        {
            this.vehicleNo = num;
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
            this.vehicleNo = vehicleHistory.vehicleNo;
            this.vehicleType = vehicleHistory.vehicleType;
            this.history = vehicleHistory.history;

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
        return vehicleType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehicleHistory)) return false;
        VehicleHistory that = (VehicleHistory) o;
        return vehicleNo.equals(that.vehicleNo) &&
                Objects.equals(vehicleType, that.vehicleType) &&
                history.equals(that.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleNo, vehicleType, history);
    }
}
