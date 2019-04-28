package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.Employee;

import java.util.Set;

public interface EmployeeRepository extends ControlRepository <Employee, Integer>
{
    Set <Employee> getAll();
}
