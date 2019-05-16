package za.ac.cput.vehiclemanagementsystem.Domain.VehicleDetails;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class VehicleDetails {
    private String vehicleReg;
    private String vehicleType;

    public VehicleDetails() {

    }

    public VehicleDetails(Builder builder) {
        this.vehicleReg = builder.vehicleReg;
        this.vehicleType = builder.vehicleType;
    }

    public static class Builder {
        private String vehicleReg;
        private String vehicleType;

        public Builder vehicleReg(String registration) {
            this.vehicleReg = registration;
            return this;
        }

        public Builder vehType(String type) {
            this.vehicleType = type;
            return this;
        }

        public VehicleDetails build() {
            return new VehicleDetails(this);
        }

    }

    public String getVehicleReg() {
        return vehicleReg;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "------ Vehicle Details ------\n" +
                "Vehicle Registration : '" + vehicleReg + '\'' +
                "\nVehicle Type : " + vehicleType + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehicleDetails)) return false;
        VehicleDetails that = (VehicleDetails) o;
        return vehicleReg.equals(that.vehicleReg) &&
                vehicleType.equals(that.vehicleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleReg, vehicleType);
    }
}
