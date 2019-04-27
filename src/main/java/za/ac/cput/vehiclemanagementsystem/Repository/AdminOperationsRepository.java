package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations;

import java.util.List;

public interface AdminOperationsRepository extends ControlRepository<AdminOperations, String>{

    List<AdminOperations> findAll();

}
