package za.ac.cput.vehiclemanagementsystem.Service.ReportService.Implements;

import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.Report.Report;
import za.ac.cput.vehiclemanagementsystem.Repository.ReportRepository.Implements.ReportRepositoryImplement;
import za.ac.cput.vehiclemanagementsystem.Repository.ReportRepository.ReportRepository;
import za.ac.cput.vehiclemanagementsystem.Service.ReportService.ReportService;

import java.util.Set;

@Service
public class ReportServiceImpl implements ReportService {

    private ReportServiceImpl service = null;
    private ReportRepository repository;

    private ReportServiceImpl()
    {
        this.repository = ReportRepositoryImplement.getRepository();
    }

    public ReportServiceImpl getService()
    {
        if (service == null)
        {
            service = new ReportServiceImpl();
        }
        return service;
    }
    
    @Override
    public Set<Report> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Report create(Report report) {
        return this.repository.create(report);
    }

    @Override
    public Report read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Report update(Report report) {
        return this.repository.update(report);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }
}
