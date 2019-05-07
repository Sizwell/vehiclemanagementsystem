package za.ac.cput.vehiclemanagementsystem.Domain.RoadWorthyTest;

public class RoadWorthyTest {

    private String vinNo;
    private String model;

    public RoadWorthyTest() {

    }

    public RoadWorthyTest(Builder builder) {
        this.vinNo = builder.vinNo;
        this.model = builder.model;
    }


    public static class Builder {
        private String vinNo;
        private String model;

        public Builder vinNo(String vin) {
            this.vinNo = vin;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public RoadWorthyTest build() {
            return new RoadWorthyTest(this);
        }
    }

    public String getVinNo() {
        return vinNo;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "------ Vehicle Road Worthy Test ------\n" +
                "VIN No : " + vinNo +
                "\nModel : '" + model + '\'';

    }
}
