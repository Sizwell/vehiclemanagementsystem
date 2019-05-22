package za.ac.cput.vehiclemanagementsystem.Service.EmployeeManagement.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement.EmployeeManagement;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeManagementRepository.EmployeeManagementRepository;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeManagementRepository.Implements.EmployeeManagementRepoImplement;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeRepository.EmployeeRepository;
import za.ac.cput.vehiclemanagementsystem.Service.EmployeeManagement.EmployeeManagementService;

import java.util.List;
@Service
public class EmployeeManagementServiceImpl implements EmployeeManagementService {


    @Autowired
    @Qualifier("InMemory")

    private static EmployeeManagementServiceImpl service = null;
    private EmployeeManagementRepository repository;

    private EmployeeManagementServiceImpl()
    {
        this.repository = EmployeeManagementRepoImplement.getEmployeesRepository();
    }

    private static EmployeeManagementServiceImpl getService()
    {
        if (service == null)
        {
            service = new EmployeeManagementServiceImpl();
        }
        return service;
    }

    @Override
    public List<EmployeeManagement> getAll() {
        return this.repository.getAll();
    }

    @Override
    public EmployeeManagement create(EmployeeManagement management)
    {
        return this.repository.create(management);
    }

    @Override
    public EmployeeManagement read(String s)
    {
        return this.repository.read(s);
    }

    @Override
    public EmployeeManagement update(EmployeeManagement management)
    {
        return this.repository.update(management);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }
}
