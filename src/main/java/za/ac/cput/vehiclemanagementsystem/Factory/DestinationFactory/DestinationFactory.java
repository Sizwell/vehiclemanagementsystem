package za.ac.cput.vehiclemanagementsystem.Factory.DestinationFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Destinations.Destinations;

public class DestinationFactory {

    public static Destinations getDestination(int id, String name, String addr) {
        return new Destinations.Builder()
                .destineId(id)
                .destineName(name)
                .destinAddress(addr)
                .build();
    }
}
