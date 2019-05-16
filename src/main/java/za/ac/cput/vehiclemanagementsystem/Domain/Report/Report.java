package za.ac.cput.vehiclemanagementsystem.Domain.Report;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Report {

    private String tourDetails;

    public Report() {

    }

    public Report(Builder builder) {
        this.tourDetails = builder.tourDetails;
    }

    public static class Builder {
        private String tourDetails;

        public Builder tourDetails(String tour) {
            this.tourDetails = tour;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }

    public String getTourDetails() {
        return tourDetails;
    }

    @Override
    public String toString() {
        return "------ Report ------\n" +
                "Tour Details : '" + tourDetails + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Report)) return false;
        Report report = (Report) o;
        return tourDetails.equals(report.tourDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tourDetails);
    }
}
