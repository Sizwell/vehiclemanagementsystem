package za.ac.cput.vehiclemanagementsystem.Factory.TrafficViolationsFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.TrafficViolations.TrafficViolations;

public class TrafficViolationsFactory {

    public static TrafficViolations getViolation(int vioNo, String vioDesc) {
        return new TrafficViolations.Builder()
                .violationNo(vioNo)
                .vioDescripton(vioDesc)
                .build();
    }

}
