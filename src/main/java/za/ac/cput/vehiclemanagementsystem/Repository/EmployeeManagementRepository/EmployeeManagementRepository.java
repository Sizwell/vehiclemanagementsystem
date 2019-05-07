package za.ac.cput.vehiclemanagementsystem.Repository.EmployeeManagementRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement.EmployeeManagement;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface EmployeeManagementRepository extends ControlRepository<EmployeeManagement, Integer>
{
    List<EmployeeManagement> getAll();
}
