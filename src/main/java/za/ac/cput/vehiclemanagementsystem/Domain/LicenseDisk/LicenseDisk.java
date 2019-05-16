package za.ac.cput.vehiclemanagementsystem.Domain.LicenseDisk;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class LicenseDisk {

    private String regNumber;
    private String vehicleModel;

    public LicenseDisk()
    {

    }

    public LicenseDisk(Builder builder)
    {
        this.regNumber = builder.regNumber;
        this.vehicleModel = builder.vehicleModel;
    }

    public static class Builder
    {
        private String regNumber;
        private String vehicleModel;

        public Builder registrationNum(String registration)
        {
            this.regNumber = registration;
            return this;
        }

        public Builder model(String vModel)
        {
            this.vehicleModel = vModel;
            return this;
        }

        public LicenseDisk build()
        {
            return new LicenseDisk(this);
        }

    }
    public String getRegNumber() {
        return regNumber;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    @Override
    public String toString() {
        return "------ LicenseDisk ------\n" +
                "Registration Number: '" + regNumber + '\'' +
                "\nVehicle Model: '" + vehicleModel + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LicenseDisk)) return false;
        LicenseDisk that = (LicenseDisk) o;
        return regNumber.equals(that.regNumber) &&
                Objects.equals(vehicleModel, that.vehicleModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, vehicleModel);
    }
}
