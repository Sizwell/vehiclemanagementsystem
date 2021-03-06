package za.ac.cput.vehiclemanagementsystem.Domain.Vehicle;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Vehicle {

    private String vinNo;
    private String vehicleType;
    private String vehicleDetails;

    public Vehicle() {

    }

    public Vehicle(Builder builder) {
        this.vinNo = builder.vinNo;
        this.vehicleType = builder.vehicleType;
        this.vehicleDetails = builder.vehicleDetails;
    }

    public static class Builder {
        private String vinNo;
        private String vehicleType;
        private String vehicleDetails;

        public Builder vinNo(String vin) {
            this.vinNo = vin;
            return this;
        }

        public Builder vehType(String type) {
            this.vehicleType = type;
            return this;
        }

        public Builder vehDetails(String details) {
            this.vehicleDetails = details;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }

    }

    public String getVinNo() {
        return vinNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    @Override
    public String toString() {
        return "------ Vehicle ------\n" +
                "Vin Number : '" + getVinNo() + '\'' +
                "\nVehicle Type : '" + getVehicleType() + '\'' +
                "\nVehicle Details : '" + getVehicleDetails() + '\'';
    }
}
