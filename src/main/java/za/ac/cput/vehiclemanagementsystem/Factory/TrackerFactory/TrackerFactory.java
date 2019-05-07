package za.ac.cput.vehiclemanagementsystem.Factory.TrackerFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Tracker.Tracker;

public class TrackerFactory {

    public static Tracker vehicleTracker(String vin, String make, String model) {
        return new Tracker.Builder()
                .vinNo(vin)
                .make(make)
                .model(model)
                .build();
    }
}
