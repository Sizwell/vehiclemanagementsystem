package za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface AdminOperationsRepository extends ControlRepository<AdminOperations, String> {

    List<AdminOperations> findAll();

}
