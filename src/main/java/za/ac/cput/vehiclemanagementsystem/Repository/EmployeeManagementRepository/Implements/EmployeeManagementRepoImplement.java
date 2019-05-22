package za.ac.cput.vehiclemanagementsystem.Repository.EmployeeManagementRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement.EmployeeManagement;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeManagementRepository.EmployeeManagementRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeManagementRepoImplement implements EmployeeManagementRepository {

    private static EmployeeManagementRepoImplement employeeRepo = null;
    private List<EmployeeManagement> employeeManagementList;

    private EmployeeManagement findManagement(String taskID)
    {
        return this.employeeManagementList.stream()
                .filter(management -> management.getTaskID().trim().equals(taskID))
                .findAny()
                .orElse(null);
    }

    private EmployeeManagementRepoImplement()
    {
        this.employeeManagementList = new ArrayList<>();
    }

    public static EmployeeManagementRepoImplement getEmployeesRepository()
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
    public EmployeeManagement read(String s)
    {
        EmployeeManagement employeeManagement = findManagement(s);
        return employeeManagement;

    }

    @Override
    public EmployeeManagement update(EmployeeManagement employeeManagement)
    {
        EmployeeManagement toUpdate = findManagement(employeeManagement.getTaskID());
        if (toUpdate != null)
        {
            this.employeeManagementList.remove(toUpdate);
            return create(employeeManagement);
        }
        return null;

}

    @Override
    public void delete(String s)
    {
        EmployeeManagement toDelete = findManagement(s);
        if (toDelete != null)
        {
            this.employeeManagementList.remove(toDelete);
        }
       /*
        AdminOperations toDelete = findOperations(delete);
        if (toDelete != null)
        {
            this.adminList.remove(toDelete);
        }
        */
    }
}
