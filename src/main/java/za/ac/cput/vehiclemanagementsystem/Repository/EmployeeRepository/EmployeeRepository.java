package za.ac.cput.vehiclemanagementsystem.Repository.EmployeeRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Employee;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.Set;

public interface EmployeeRepository extends ControlRepository<Employee, Integer>
{
    Set<Employee> getAll();
}
