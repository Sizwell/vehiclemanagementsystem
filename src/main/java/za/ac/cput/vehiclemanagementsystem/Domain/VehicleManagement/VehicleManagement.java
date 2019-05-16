package za.ac.cput.vehiclemanagementsystem.Domain.VehicleManagement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class VehicleManagement {

    private String vehicleID;
    private String vehicleDetails;

    public VehicleManagement() {

    }

    public VehicleManagement(Builder builder) {
        this.vehicleID = builder.vehicleID;
        this.vehicleDetails = builder.vehicleDetails;
    }

    public static class Builder {

        private String vehicleID;
        private String vehicleDetails;

        public Builder vehicleID(String id){
            this.vehicleID = id;
            return this;
        }

        public Builder details(String details) {
            this.vehicleDetails = details;
            return this;
        }

        public Builder copyVM(VehicleManagement vm)
        {
            this.vehicleID = vm.vehicleID;
            this.vehicleDetails = vm.vehicleDetails;
            return this;
        }

        public VehicleManagement build() {
            return new VehicleManagement(this);
        }
    }

    public String getVehicleId() {
        return vehicleID;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }


    @Override
    public String toString() {
        return "------ Vehicle Management ------\n{" +
                "Vehicle id : '" + getVehicleId() + "\n" +
                "Vehicle Details :'" + getVehicleDetails() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehicleManagement)) return false;
        VehicleManagement that = (VehicleManagement) o;
        return vehicleID.equals(that.vehicleID) &&
                vehicleDetails.equals(that.vehicleDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleID, vehicleDetails);
    }
}
