package za.ac.cput.vehiclemanagementsystem.Service.EmployeeService.Implements;

import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Employee;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeRepository.EmployeeRepository;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeRepository.Implements.EmployeeRepositoryImplement;
import za.ac.cput.vehiclemanagementsystem.Service.EmployeeService.EmployeeService;

import java.util.Set;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl()
    {
        this.repository = EmployeeRepositoryImplement.getEmployee();
    }

    public EmployeeServiceImpl getService()
    {
        if (service == null)
        {
            service = new EmployeeServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Employee> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee read(Integer integer) {
        return this.repository.read(integer);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(Integer integer) {
        this.repository.delete(integer);
    }
}
