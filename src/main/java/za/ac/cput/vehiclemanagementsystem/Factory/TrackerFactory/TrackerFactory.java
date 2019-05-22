package za.ac.cput.vehiclemanagementsystem.Factory.TrackerFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Tracker.Tracker;

public class TrackerFactory {

    public static Tracker vehicleTracker(String trackerNo, String type, String make) {
        return new Tracker.Builder()
                .trackerNo(trackerNo)
                .trackerType(type)
                .make(make)
                .build();
    }
}
