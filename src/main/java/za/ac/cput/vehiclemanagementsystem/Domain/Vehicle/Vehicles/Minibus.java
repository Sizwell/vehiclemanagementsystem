package za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicles;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Minibus {


    private String vinNo;
    private int driverNo;
    private int capacity;


    public Minibus() {

    }


    public Minibus(Builder builder) {
        this.vinNo = builder.vinNo;
        this.driverNo = builder.driverNo;
        this.capacity = builder.capacity;
    }

    public static class Builder {
        private String vinNo;
        private int driverNo;
        private int capacity;

        public Builder vinNo(String vin) {
            this.vinNo = vin;
            return this;
        }

        public Builder driverNum(int num) {
            this.driverNo = num;
            return this;
        }

        public Builder capacity(int cap) {
            this.capacity = cap;
            return this;
        }

        public Minibus build() {
            return new Minibus(this);
        }

    }

    public String getVinNo() {
        return vinNo;
    }

    public int getDriverNo() {
        return driverNo;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "------ Minibus ------\n" +
                "\nVin No : '" + vinNo + '\'' +
                "\nDriver No : " + driverNo +
                "\nCapacity : " + capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Minibus)) return false;
        Minibus minibus = (Minibus) o;
        return driverNo == minibus.driverNo &&
                capacity == minibus.capacity &&
                vinNo.equals(minibus.vinNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNo, driverNo, capacity);
    }
}
