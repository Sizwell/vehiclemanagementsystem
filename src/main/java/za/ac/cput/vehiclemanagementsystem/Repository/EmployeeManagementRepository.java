package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement;

import java.util.List;

public interface EmployeeManagementRepository extends ControlRepository <EmployeeManagement, Integer>
{
    List<EmployeeManagement> getAll();
}
