package za.ac.cput.vehiclemanagementsystem.Service.EmployeeService;

import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Employee;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.Set;

public interface EmployeeService extends ControlService <Employee, Integer>
{
    Set<Employee> getAll();
}
