package za.ac.cput.vehiclemanagementsystem.Factory.RequestFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Requests.Requests;

import java.util.Date;

public class RequestFactory {

    public static Requests getRequests(String details, Date date) {
        return new Requests.Builder()
                .details(details)
                .date(date)
                .build();
    }

}
