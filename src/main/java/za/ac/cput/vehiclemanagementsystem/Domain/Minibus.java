package za.ac.cput.vehiclemanagementsystem.Domain;

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

}
