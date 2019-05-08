package za.ac.cput.vehiclemanagementsystem.Factory.TourFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Tour.Tour;

public class TourFactory {

    public static Tour getTourDetails(int tourID, String destine, int duration) {
        return new Tour.Builder()
                .tNum(tourID)
                .tourDestination(destine)
                .tourDuration(duration)
                .build();
    }

}
