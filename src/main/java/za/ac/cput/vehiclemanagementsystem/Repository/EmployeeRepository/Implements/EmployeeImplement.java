package za.ac.cput.vehiclemanagementsystem.Repository.EmployeeRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Employee;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeRepository.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeImplement implements EmployeeRepository {

    private static EmployeeImplement employeeRepo = null;
    private Set<Employee> employeeSet;

    private EmployeeImplement()
    {
        this.employeeSet = new HashSet<>();
    }

    public EmployeeRepository getEmployee()
    {
        if(employeeRepo == null)
        {
            employeeRepo = new EmployeeImplement();
        }
        return employeeRepo;
    }

    @Override
    public Set<Employee> getAll()
    {
        return this.employeeSet;
    }

    @Override
    public Employee create(Employee employee)
    {
        this.employeeSet.add(employee);
        return employee;
    }

    @Override
    public Employee read(Integer integer) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}
