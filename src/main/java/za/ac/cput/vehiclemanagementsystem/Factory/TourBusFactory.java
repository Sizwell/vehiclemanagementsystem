package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.TourBus;

public class TourBusFactory {

    public static TourBus getTourBus(String vn, String type, String name) {
        return new TourBus.Builder()
                .vinNo(vn)
                .busType(type)
                .busType(name)
                .build();
    }

}
