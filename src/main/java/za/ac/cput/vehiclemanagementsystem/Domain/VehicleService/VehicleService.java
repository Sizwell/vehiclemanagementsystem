package za.ac.cput.vehiclemanagementsystem.Domain.VehicleService;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class VehicleService {

    private String vinNo;
    private String model;
    private String make;

    public VehicleService() {

    }

    public VehicleService(Builder builder) {
        this.vinNo = builder.vinNo;
        this.model = builder.model;
        this.make = builder.make;
    }

    public static class Builder {
        private String vinNo;
        private String model;
        private String make;

        public Builder vinNo(String vin) {
            this.vinNo = vin;
            return this;
        }

        public Builder make(String make) {
            this.make = make;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder copyVin(VehicleService vehicleServiceNo)
        {
            this.vinNo = vehicleServiceNo.vinNo;
            return this;

        }

        public VehicleService build() {
            return new VehicleService(this);
        }
    }

    public String getVinNo() {
        return vinNo;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        return "------ Register Vehicle ------\n" +
                "VIN No : " + getVinNo() +
                "\nModel : '" + getModel() + '\'' +
                "\nMake : '" + getMake() + '\'';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehicleService)) return false;
        VehicleService vehicleService = (VehicleService) o;
        return vinNo.equals(vehicleService.vinNo) &&
                Objects.equals(model, vehicleService.model) &&
                Objects.equals(make, vehicleService.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNo, model, make);
    }
}
