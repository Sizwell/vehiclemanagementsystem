package za.ac.cput.vehiclemanagementsystem.Factory.ApprovalsFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Approvals.Approvals;

import java.util.Date;

public class ApprovalsFactory {

    public static Approvals getApproval(String approval, Date date, String details) {
        return new Approvals.Builder()
                .approvalNo(approval)
                .date(date)
                .details(details)
                .build();
    }
}
