package za.ac.cput.vehiclemanagementsystem.Repository.ReportRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Report.Report;
import za.ac.cput.vehiclemanagementsystem.Repository.ReportRepository.ReportRepository;

import java.util.HashSet;
import java.util.Set;

public class ReportRepositoryImplement implements ReportRepository {

    private static ReportRepositoryImplement reportImpplement = null;
    private Set<Report> reportSet;

    private ReportRepositoryImplement()
    {
        this.reportSet = new HashSet<>();
    }

    private ReportRepository getReport()
    {
        if(reportImpplement == null)
        {
            reportImpplement = new ReportRepositoryImplement();
        }
        return reportImpplement;
    }

    @Override
    public Set<Report> getAll()
    {
        return this.reportSet;
    }

    @Override
    public Report create(Report report)
    {
        this.reportSet.add(report);
        return report;
    }

    @Override
    public Report read(String s) {
        return null;
    }

    @Override
    public Report update(Report report) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
