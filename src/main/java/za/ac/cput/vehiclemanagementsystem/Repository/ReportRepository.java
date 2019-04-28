package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.Report;

import java.util.Set;

public interface ReportRepository extends ControlRepository <Report, String>
{
    Set <Report> getAll();
}
