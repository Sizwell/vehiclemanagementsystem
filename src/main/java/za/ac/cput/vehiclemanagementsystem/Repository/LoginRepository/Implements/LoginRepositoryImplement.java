package za.ac.cput.vehiclemanagementsystem.Repository.LoginRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.Login.Login;
import za.ac.cput.vehiclemanagementsystem.Repository.LoginRepository.LoginRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class LoginRepositoryImplement implements LoginRepository {

    private static LoginRepositoryImplement loginRepo = null;


    private List <Login> logins;

    private LoginRepositoryImplement()
    {
        this.logins = new ArrayList<>();
    }


    private Login viewCredentials(String username/*, String password*/)
    {
        return this.logins.stream().filter(login -> login.getUsername().trim().equals(username))
                .findAny()
                .orElse(null);
    }

    public static LoginRepositoryImplement getCredentials()
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
        Login log = viewCredentials(loginDetails);
        return log;
    }

    @Override
    public Login update(Login login)
    {
        Login credToDelete = viewCredentials(login.getUsername());
        if(credToDelete != null)
        {
            this.logins.remove(credToDelete);
            return create(login);
        }
        return null;
        /*loginRepo.update(login);
        return login;*/
    }

    @Override
    public void delete(String s)
    {
        Login login = viewCredentials(s);
        if (login != null)
        {
            this.logins.remove(login);
        }
    }
}
