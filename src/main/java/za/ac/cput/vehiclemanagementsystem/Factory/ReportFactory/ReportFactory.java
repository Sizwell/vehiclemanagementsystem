package za.ac.cput.vehiclemanagementsystem.Factory.ReportFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Report.Report;

public class ReportFactory {

    public static Report getReport(String tourReport) {
        return new Report.Builder()
                .tourDetails(tourReport)
                .build();
    }
}
