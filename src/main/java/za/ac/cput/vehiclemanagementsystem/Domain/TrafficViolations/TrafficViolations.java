package za.ac.cput.vehiclemanagementsystem.Domain.TrafficViolations;

public class TrafficViolations {

    private int violationNo;
    private String vioDescription;

    public TrafficViolations() {

    }

    public TrafficViolations(Builder builder) {
        this.violationNo = builder.violationNo;
        this.vioDescription = builder.vioDescription;
    }

    public static class Builder {
        private int violationNo;
        private String vioDescription;

        public Builder violationNo(int no) {
            this.violationNo = no;
            return this;
        }

        public Builder vioDescripton(String name) {
            this.vioDescription = name;
            return this;
        }

        public TrafficViolations build() {
            return new TrafficViolations(this);
        }

    }

    public int getViolationNo() {
        return violationNo;
    }

    public String getVioDescription() {
        return vioDescription;
    }

    @Override
    public String toString() {
        return "------ Employee Check-out------" +
                "\nViolation No : " + violationNo +
                "\nViolation Description : '" + vioDescription + '\'';
    }
}
