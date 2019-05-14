package za.ac.cput.vehiclemanagementsystem.Service.AdminOperations;

import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.List;

public interface AdminOperationsService extends ControlService <AdminOperations, String>
{
    List<AdminOperations> findAll();
}
