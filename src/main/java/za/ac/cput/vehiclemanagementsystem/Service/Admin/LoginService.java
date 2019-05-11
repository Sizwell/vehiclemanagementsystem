package za.ac.cput.vehiclemanagementsystem.Service.Admin;

import za.ac.cput.vehiclemanagementsystem.Domain.Login.Login;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.List;

public interface LoginService extends ControlService <Login, String>
{
    List<Login> getCredentials();
}
