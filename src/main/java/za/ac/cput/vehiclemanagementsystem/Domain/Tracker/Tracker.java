package za.ac.cput.vehiclemanagementsystem.Domain.Tracker;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Tracker {

    private String vinNo;
    private String model;
    private String make;

    public Tracker() {

    }

    public Tracker(Builder builder) {
        this.vinNo = builder.vinNo;
        this.model = builder.model;
        this.make = builder.make;
    }

    public static class Builder {
        private String vinNo;
        private String model;
        private String make;

        public Builder vinNo(String vin) {
            this.vinNo = vin;
            return this;
        }

        public Builder make(String make) {
            this.make = make;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }


        public Builder copyTracker(Tracker trackerID)
        {
            this.vinNo = trackerID.vinNo;
            this.make = trackerID.make;
            this.model = trackerID.model;
            return this;

        }

        public Tracker build() {
            return new Tracker(this);
        }
    }

    public String getVinNo() {
        return vinNo;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        return "------ Vehicle Tracker ------\n" +
                "VIN No : " + getVinNo() +
                "\nModel : '" + getModel() + '\'' +
                "\nMake : '" + getMake() + '\'';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tracker)) return false;
        Tracker tracker = (Tracker) o;
        return vinNo.equals(tracker.vinNo) &&
                Objects.equals(model, tracker.model) &&
                Objects.equals(make, tracker.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNo, model, make);
    }
}
