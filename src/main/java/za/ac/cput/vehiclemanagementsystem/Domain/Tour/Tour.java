package za.ac.cput.vehiclemanagementsystem.Domain.Tour;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Tour {

    private int tourID;
    private String tourDestination;
    private int tourDuration;

    public Tour() {

    }

    public Tour(Builder builder) {
        this.tourID = builder.tourID;
        this.tourDestination = builder.tourDestination;
        this.tourDuration = builder.tourDuration;
    }


    public static class Builder {
        private int tourID;
        private String tourDestination;
        private int tourDuration;

        public Builder tNum(int tNum) {
            this.tourID = tNum;
            return this;
        }

        public Builder tourDestination(String attraction) {
            this.tourDestination = attraction;
            return this;
        }

        public Builder tourDuration(int days) {
            this.tourDuration = days;
            return this;
        }

        public Builder copyTour(Tour tour)
        {
            this.tourID = tour.tourID;
            this.tourDuration = tour.tourDuration;
            this.tourDestination = tour.tourDestination;

            return this;
        }

        public Tour build() {
            return new Tour(this);
        }
    }

    public int getTourNo() {
        return tourID;
    }

    public String getDestination() {
        return tourDestination;
    }

    public int getTourDuration() {
        return tourDuration;
    }

    @Override
    public String toString() {
        return "------ Tour Details ------\n" +
                "\nTour ID : '" + tourID + '\'' +
                "\nTour Destination : '" + tourDestination + '\'' +
                "\nTour Duration : '" + tourDuration + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tour)) return false;
        Tour tour = (Tour) o;
        return tourID == tour.tourID &&
                tourDuration == tour.tourDuration &&
                tourDestination.equals(tour.tourDestination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tourID, tourDestination, tourDuration);
    }
}
