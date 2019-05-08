package za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicles;

public class Sprinter {

    private String vinNo;
    private int driverNo;
    private int capacity;


    public Sprinter() {

    }


    public Sprinter(Builder builder) {
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

        public Sprinter build() {
            return new Sprinter(this);
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
        return "------ Sprinter ------\n" +
                "\nVin No : '" + vinNo + '\'' +
                "\nDriver No : " + driverNo +
                "\nCapacity : " + capacity;
    }
}