package za.ac.cput.vehiclemanagementsystem.Domain.Destinations;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Destinations {

    private int destineID;
    private String destinName;
    private String address;

    public Destinations() {

    }

    public Destinations(Builder builder) {
        this.destineID = builder.destineID;
        this.destinName = builder.destinName;
        this.address = builder.address;
    }

    public static class Builder {
        private int destineID;
        private String destinName;
        private String address;

        public Builder destineId(int destID) {
            this.destineID = destID;
            return this;
        }

        public Builder destineName(String dName) {
            this.destinName = dName;
            return this;
        }

        public Builder destinAddress(String dAddress) {
            this.address = dAddress;
            return this;
        }

        public Destinations build() {
            return new Destinations(this);
        }

    }

    public int getDestineID() {
        return destineID;
    }

    public String getDestinName() {
        return destinName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "------ Destination ------\n" +
                "Destination ID : " + destineID +
                "\nDestination Name : '" + destinName + '\'' +
                "\nAddress : '" + address + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Destinations)) return false;
        Destinations that = (Destinations) o;
        return destineID == that.destineID &&
                Objects.equals(destinName, that.destinName) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destineID, destinName, address);
    }
}

