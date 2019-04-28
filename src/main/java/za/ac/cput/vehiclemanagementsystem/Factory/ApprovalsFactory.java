package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Approvals;

import java.util.Date;

public class ApprovalsFactory {

    public static Approvals getApproval(String vin, Date date, String details) {
        return new Approvals.Builder()
                .vinNo(vin)
                .date(date)
                .details(details)
                .build();
    }
}
