package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Report;

public class ReportFactory {

    public static Report getReport(String tourReport)
    {
        return new Report.Builder()
                .tourDetails(tourReport)
                .build();
    }
}
