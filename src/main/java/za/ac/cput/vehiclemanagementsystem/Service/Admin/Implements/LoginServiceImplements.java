package za.ac.cput.vehiclemanagementsystem.Service.Admin.Implements;

import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.Login.Login;
import za.ac.cput.vehiclemanagementsystem.Repository.LoginRepository.Implements.LoginRepositoryImplement;
import za.ac.cput.vehiclemanagementsystem.Repository.LoginRepository.LoginRepository;
import za.ac.cput.vehiclemanagementsystem.Service.Admin.LoginService;

import java.util.List;
import java.util.Set;

@Service 

public class LoginServiceImplements implements LoginService {
    
    private static LoginServiceImplements loginService = null;
    private LoginRepository loginRepository;
    
    private LoginServiceImplements()
    {
        this.loginRepository = LoginRepositoryImplement.getCredentials();
    }
    
    public static LoginServiceImplements getLoginService()
    {
        if(loginService == null)
        {
            loginService = LoginServiceImplements.getLoginService();
        }
        return loginService;
    }
    
    @Override
    public List<Login> getCredentials()
    {
        return this.loginRepository.getAll();
    }

    @Override
    public Login create(Login login)
    {
        return this.loginRepository.create(login);
    }

    @Override
    public Login read(String s)
    {
        return this.loginRepository.read(s);
    }

    @Override
    public Login update(Login login)
    {
        return loginRepository.update(login);
    }

    @Override
    public void delete(String s)
    {
        this.loginRepository.delete(s);
    }
}
