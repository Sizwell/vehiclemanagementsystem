package za.ac.cput.vehiclemanagementsystem.Factory.RoadWorthTestFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.RoadWorthyTest.RoadWorthyTest;

public class RoadWorthyTestFactory {

    public static RoadWorthyTest getRoadWorthyTest(String vin, String model) {
        return new RoadWorthyTest.Builder()
                .vinNo(vin)
                .model(model)
                .build();
    }
}
