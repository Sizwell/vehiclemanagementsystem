package za.ac.cput.vehiclemanagementsystem.Domain.Service;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Service {

    private String vinNo;
    private String model;
    private String make;

    public Service() {

    }

    public Service(Builder builder) {
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

        public Builder copyVin(Service serviceNo)
        {
            this.vinNo = serviceNo.vinNo;
            return this;

        }

        public Service build() {
            return new Service(this);
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
        if (!(o instanceof Service)) return false;
        Service service = (Service) o;
        return vinNo.equals(service.vinNo) &&
                Objects.equals(model, service.model) &&
                Objects.equals(make, service.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNo, model, make);
    }
}
