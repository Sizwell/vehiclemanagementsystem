package za.ac.cput.vehiclemanagementsystem.Repository.ReportRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.Report.Report;
import za.ac.cput.vehiclemanagementsystem.Repository.ReportRepository.ReportRepository;

import java.util.*;

@Repository
public class ReportRepositoryImplement implements ReportRepository {

    private static ReportRepositoryImplement repository = null;
    private Map<String, Report> reportSet;

    private ReportRepositoryImplement()
    {
        this.reportSet = new HashMap<>();
    }

    public static ReportRepositoryImplement getRepository()
    {
        if(repository == null)
        {
            repository = new ReportRepositoryImplement();
        }
        return repository;
    }

    @Override
    public Set<Report> getAll() {
        Collection <Report> reportCollection = this.reportSet.values();
        Set <Report> reportSet = new HashSet<>();
        reportSet.addAll(reportCollection);
        return reportSet;
    }

    @Override
    public Report create(Report report) {
        return null;
    }

    @Override
    public Report read(String s)
    {
        return this.reportSet.get(s);
    }

    @Override
    public Report update(Report report) {
        this.reportSet.replace(report.getReportID(), report);
        return this.reportSet.get(report.getReportID());
    }

    @Override
    public void delete(String s) {
        this.reportSet.remove(s);
    }

}
