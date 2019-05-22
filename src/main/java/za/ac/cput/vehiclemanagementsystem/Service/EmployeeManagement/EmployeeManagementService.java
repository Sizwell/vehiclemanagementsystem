package za.ac.cput.vehiclemanagementsystem.Service.EmployeeManagement;

import za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement.EmployeeManagement;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.List;

public interface EmployeeManagementService extends ControlService<EmployeeManagement, String>
{
    List <EmployeeManagement> getAll();
}
