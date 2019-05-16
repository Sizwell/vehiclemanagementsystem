package za.ac.cput.vehiclemanagementsystem.Domain.TrafficViolations;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class TrafficViolations {

    private String violationNo;
    private String vioDescription;

    public TrafficViolations() {

    }

    public TrafficViolations(Builder builder) {
        this.violationNo = builder.violationNo;
        this.vioDescription = builder.vioDescription;
    }

    public static class Builder {
        private String violationNo;
        private String vioDescription;

        public Builder violationNo(String no) {
            this.violationNo = no;
            return this;
        }

        public Builder vioDescripton(String name) {
            this.vioDescription = name;
            return this;
        }

        public Builder copyViolations(TrafficViolations violation)
        {
            this.violationNo = violation.violationNo;
            this.vioDescription = violation.vioDescription;
            return this;

        }

        public TrafficViolations build() {
            return new TrafficViolations(this);
        }

    }

    public String getViolationNo() {
        return violationNo;
    }

    public String getVioDescription() {
        return vioDescription;
    }

    @Override
    public String toString() {
        return "------ Employee Check-out------" +
                "\nViolation No : " + getViolationNo() +
                "\nViolation Description : '" + getVioDescription() + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TrafficViolations)) return false;
        TrafficViolations that = (TrafficViolations) o;
        return violationNo == that.violationNo &&
                vioDescription.equals(that.vioDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(violationNo, vioDescription);
    }
}
