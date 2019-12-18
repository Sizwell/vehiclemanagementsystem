package za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface AdminOperationsRepository extends JpaRepository<AdminOperations, String> {

  //  List<AdminOperations> findAll();

}
