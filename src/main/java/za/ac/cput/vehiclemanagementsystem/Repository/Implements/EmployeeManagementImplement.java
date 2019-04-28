package za.ac.cput.vehiclemanagementsystem.Repository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeManagementRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementImplement implements EmployeeManagementRepository {

    private static EmployeeManagementImplement employeeRepo = null;
    private List<EmployeeManagement> employeeManagementList;

    private EmployeeManagementImplement()
    {
        this.employeeManagementList = new ArrayList<>();
    }

    public static EmployeeManagementRepository getEmployees()
    {
        if(employeeRepo == null)
        {
            employeeRepo = new EmployeeManagementImplement();
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
