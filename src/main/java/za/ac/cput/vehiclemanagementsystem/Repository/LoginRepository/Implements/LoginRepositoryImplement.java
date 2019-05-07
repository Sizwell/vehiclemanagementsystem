package za.ac.cput.vehiclemanagementsystem.Repository.LoginRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Login.Login;
import za.ac.cput.vehiclemanagementsystem.Repository.LoginRepository.LoginRepository;

import java.util.ArrayList;
import java.util.List;

public class LoginRepositoryImplement implements LoginRepository {

    private static LoginRepositoryImplement loginRepo = null;

    private List <Login> logins;

    private LoginRepositoryImplement()
    {
        this.logins = new ArrayList<>();
    }

    public static LoginRepository getCredentials()
    {
        if (loginRepo == null){
            loginRepo = new LoginRepositoryImplement();
        }
        return loginRepo;
    }

    @Override
    public List<Login> getAll()
    {
        return this.logins;
    }

    @Override
    public Login create(Login login)
    {
        this.logins.add(login);
        return login;
    }

    @Override
    public Login read(String loginDetails)
    {
        return loginRepo.read(loginDetails);
    }

    @Override
    public Login update(Login login)
    {
        loginRepo.update(login);
        return login;
    }

    @Override
    public void delete(String s)
    {

    }
}
