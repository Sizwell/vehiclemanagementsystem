package za.ac.cput.vehiclemanagementsystem.Repository.LoginRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Login.Login;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface LoginRepository extends ControlRepository<Login, String>
{
    List<Login> getAll();
}
