package za.ac.cput.vehiclemanagementsystem.Repository.EmployeeManagementRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement.EmployeeManagement;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeManagementRepository.EmployeeManagementRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementRepoImplement implements EmployeeManagementRepository {

    private static EmployeeManagementRepoImplement employeeRepo = null;
    private List<EmployeeManagement> employeeManagementList;

    private EmployeeManagementRepoImplement()
    {
        this.employeeManagementList = new ArrayList<>();
    }

    public static EmployeeManagementRepository getEmployees()
    {
        if(employeeRepo == null)
        {
            employeeRepo = new EmployeeManagementRepoImplement();
        }
        return employeeRepo;
    }

    @Override
    public List<EmployeeManagement> getAll()
    {
        return this.employeeManagementList;
    }

    @Override
    public EmployeeManagement create(EmployeeManagement employeeManagement)
    {
        this.employeeManagementList.add(employeeManagement);
        return employeeManagement;
    }

    @Override
    public EmployeeManagement read(Integer integer) {
        return null;
    }

    @Override
    public EmployeeManagement update(EmployeeManagement employeeManagement) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}
