package za.ac.cput.vehiclemanagementsystem.Domain.Tour;

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
}
