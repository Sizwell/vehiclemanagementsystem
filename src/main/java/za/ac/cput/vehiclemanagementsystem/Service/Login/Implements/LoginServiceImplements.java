package za.ac.cput.vehiclemanagementsystem.Service.Login.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.Login.Login;
import za.ac.cput.vehiclemanagementsystem.Repository.LoginRepository.Implements.LoginRepositoryImplement;
import za.ac.cput.vehiclemanagementsystem.Repository.LoginRepository.LoginRepository;
import za.ac.cput.vehiclemanagementsystem.Service.Login.LoginService;

import java.util.List;

@Service 

public class LoginServiceImplements implements LoginService {

    @Autowired
   // @Qualifier("InMemory")
    
    private LoginServiceImplements loginService = null;
    private LoginRepository loginRepository;
    
    private LoginServiceImplements()
    {
        this.loginRepository = LoginRepositoryImplement.getCredentials();
    }
    
    public LoginServiceImplements getLoginService()
    {
        if(loginService == null)
        {
            loginService = new LoginServiceImplements();
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
