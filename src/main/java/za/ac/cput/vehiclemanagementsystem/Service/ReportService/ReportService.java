package za.ac.cput.vehiclemanagementsystem.Service.ReportService;

import za.ac.cput.vehiclemanagementsystem.Domain.Report.Report;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.Set;

public interface ReportService  extends ControlService <Report, String>
{
    Set<Report> getAll();
}
