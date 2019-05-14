package za.ac.cput.vehiclemanagementsystem.Repository.EmployeeRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Employee;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeRepository.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImplement implements EmployeeRepository {

    private static EmployeeRepositoryImplement employeeRepo = null;
    private Set<Employee> employeeSet;

    private EmployeeRepositoryImplement()
    {
        this.employeeSet = new HashSet<>();
    }

    public EmployeeRepository getEmployee()
    {
        if(employeeRepo == null)
        {
            employeeRepo = new EmployeeRepositoryImplement();
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
