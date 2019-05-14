package za.ac.cput.vehiclemanagementsystem.Factory.RequestFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Requests.Requests;

import java.util.Date;

public class RequestFactory {

    public static Requests getRequests(String reqNo, String details, Date date) {
        return new Requests.Builder()
                .reguestNo(reqNo)
                .details(details)
                .date(date)
                .build();
    }

}
