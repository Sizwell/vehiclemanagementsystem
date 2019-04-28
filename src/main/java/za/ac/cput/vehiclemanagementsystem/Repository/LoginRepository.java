package za.ac.cput.vehiclemanagementsystem.Repository;

import sun.rmi.runtime.Log;
import za.ac.cput.vehiclemanagementsystem.Domain.Login;

import java.util.List;

public interface LoginRepository extends ControlRepository <Login, String>
{
    List<Login> getAll();
}
