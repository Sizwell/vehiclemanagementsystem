package za.ac.cput.vehiclemanagementsystem.Repository.ReportRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Report.Report;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.Set;

public interface ReportRepository extends ControlRepository<Report, String>
{
    Set <Report> getAll();
}
