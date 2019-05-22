package za.ac.cput.vehiclemanagementsystem.Factory.ReportFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Report.Report;

public class ReportFactory {

    public static Report getReport(String repID ,String tourReport) {
        return new Report.Builder()
                .reportID(repID)
                .tourDetails(tourReport)
                .build();
    }
}
