package za.ac.cput.vehiclemanagementsystem.Repository.EmployeeRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Employee;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeRepository.EmployeeRepository;

import java.util.*;

@Repository
public class EmployeeRepositoryImplement implements EmployeeRepository {

    private static EmployeeRepositoryImplement employeeRepo = null;
    private Map<Integer, Employee> employeeMap;

    private EmployeeRepositoryImplement()
    {
        this.employeeMap = new HashMap<>();
    }

    private Employee findEmployee(String empName)
    {
        //return this.employeeMap.entrySet().parallelStream().filter(empNo).findAny().orElse(null);
        return this.employeeMap.values().stream().filter(employee -> employee.getEmpName().trim().equals(empName))
                .findAny()
                .orElse(null);
    }

    public static EmployeeRepositoryImplement getEmployee()
    {
        if(employeeRepo == null)
        {
            employeeRepo = new EmployeeRepositoryImplement();
        }
        return employeeRepo;
    }


    @Override
    public Set<Employee> getAll() {
        Collection <Employee> employeeCollection = this.employeeMap.values();
        Set <Employee> employeeSet = new HashSet<>();
        employeeSet.addAll(employeeCollection);
        return employeeSet;
    }

    @Override
    public Employee create(Employee employee) {
        this.employeeMap.put(employee.getEmpNumb(), employee);
        return employee;
    }

    @Override
    public Employee read(Integer integer) {
        return this.employeeMap.get(integer);
    }

    @Override
    public Employee update(Employee employee) {
        this.employeeMap.replace(employee.getEmpNumb(), employee);
        return this.employeeMap.get(employee.getEmpNumb());
    }

    @Override
    public void delete(Integer integer) {
        this.employeeMap.remove(integer);
    }

}
