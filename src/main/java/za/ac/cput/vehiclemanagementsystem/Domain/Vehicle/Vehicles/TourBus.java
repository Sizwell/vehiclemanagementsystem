package za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicles;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class TourBus {

    private String vinNo;
    private String busType;
    private String vehName;


    public TourBus() {

    }

    public TourBus(Builder builder) {
        this.vinNo = builder.vinNo;
        this.busType = builder.busType;
        this.vehName = builder.vehName;
    }

    public static class Builder {
        private String vinNo;
        private String busType;
        private String vehName;

        public Builder vinNo(String vin) {
            this.vinNo = vin;
            return this;
        }

        public Builder busType(String type) {
            this.busType = type;
            return this;
        }

        public Builder vehName(String name) {
            this.vehName = name;
            return this;
        }

        public TourBus build() {
            return new TourBus(this);
        }

    }

    public String getVinNo() {
        return vinNo;
    }

    public String getBusType() {
        return busType;
    }

    public String getVehName() {
        return vehName;
    }

    @Override
    public String toString() {
        return "------ TourBus ------\n" +
                "Vin No :'" + vinNo + '\'' +
                "\nBus Type : '" + busType + '\'' +
                "\nVehicle Name : '" + vehName + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TourBus)) return false;
        TourBus tourBus = (TourBus) o;
        return vinNo.equals(tourBus.vinNo) &&
                Objects.equals(busType, tourBus.busType) &&
                Objects.equals(vehName, tourBus.vehName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNo, busType, vehName);
    }
}
