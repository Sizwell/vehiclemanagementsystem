package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Destinations;

public class DestinationFactory {

    public static Destinations getDestination(int id, String name, String addr)
    {
        return new Destinations.Builder()
                .destineId(id)
                .destineName(name)
                .destinAddress(addr)
                .build();
    }
}
