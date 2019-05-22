package za.ac.cput.vehiclemanagementsystem.Domain.Tracker;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Tracker {

    private String trackerNo;
    private String trackerType;
    private String make;

    public Tracker() {

    }

    public Tracker(Builder builder) {
        this.trackerNo = builder.trackerNo;
        this.trackerType = builder.trackerType;
        this.make = builder.make;
    }

    public static class Builder {
        private String trackerNo;
        private String trackerType;
        private String make;

        public Builder trackerNo(String vin) {
            this.trackerNo = vin;
            return this;
        }

        public Builder make(String make) {
            this.make = make;
            return this;
        }

        public Builder trackerType(String trackerType) {
            this.trackerType = trackerType;
            return this;
        }


        public Builder copyTracker(Tracker trackerID)
        {
            this.trackerNo = trackerID.trackerNo;
            this.make = trackerID.make;
            this.trackerType = trackerID.trackerType;
            return this;

        }

        public Tracker build() {
            return new Tracker(this);
        }
    }

    public String getTrackerNo() {
        return trackerNo;
    }

    public String getTrackerType() {
        return trackerType;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        return "------ Vehicle Tracker ------\n" +
                "VIN No : " + getTrackerNo() +
                "\nType : '" + getTrackerType() + '\'' +
                "\nMake : '" + getMake() + '\'';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tracker)) return false;
        Tracker tracker = (Tracker) o;
        return trackerNo.equals(tracker.trackerNo) &&
                Objects.equals(trackerType, tracker.trackerType) &&
                Objects.equals(make, tracker.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackerNo, trackerType, make);
    }
}
