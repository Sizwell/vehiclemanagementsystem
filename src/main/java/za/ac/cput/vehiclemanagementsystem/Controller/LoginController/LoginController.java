package za.ac.cput.vehiclemanagementsystem.Controller.LoginController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.vehiclemanagementsystem.Domain.Login.Login;
import za.ac.cput.vehiclemanagementsystem.Factory.LoginFactory.LoginFactory;
import za.ac.cput.vehiclemanagementsystem.Service.Login.Implements.LoginServiceImplements;

import java.util.List;

@RestController
@RequestMapping("/vehiclemanagementsystem/login")
public class LoginController {

    @Autowired
    private LoginServiceImplements service;

    @GetMapping("/create/{username}/{password}")
    Login create(@PathVariable String username, String password)
    {
        Login login = LoginFactory.getLogin(username, password);
        return service.create(login);
    }

    @GetMapping("/getAll")
    @ResponseBody

    public List<Login> getALl()
    {
        return service.getCredentials();
    }
}
