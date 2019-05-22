package za.ac.cput.vehiclemanagementsystem.Service.Login.Implements;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Login.Login;
import za.ac.cput.vehiclemanagementsystem.Factory.LoginFactory.LoginFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.LoginRepository.Implements.LoginRepositoryImplement;

import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginVehicleServiceImplementsTest {

    private LoginRepositoryImplement repository;
    private Login login;

    private Login getLogin()
    {
        List<Login> loginList = this.repository.getAll();
        return this.repository.getAll().listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = LoginRepositoryImplement.getCredentials();
        this.login = LoginFactory.getLogin("Login", "Login@VMgm");
    }

    @Test
    public void getAll()
    {
        List<Login> loginList = this.repository.getAll();
        System.out.println("Getting All, Login List = " + loginList);
    }

    @Test
    public void create()
    {
        Login creating = this.repository.create(this.login);
        System.out.println("On Login, create = " + creating + "\n");
        Assert.assertNotNull(creating);
        Assert.assertSame(creating, this.login);
    }

    @Test
    public void read()
    {
        Login saved = getLogin();
        Login usernameReader = this.repository.read(saved.getUsername());
        Login passwordReader =  this.repository.read(saved.getPassword());
        System.out.println("...Reading ... " + usernameReader + " " + passwordReader);
        Assert.assertSame(saved, usernameReader);
    }

    @Test
    public void update()
    {
    }

    @Test
    public void delete()
    {
        Login saved = getLogin();
        this.repository.delete(saved.getUsername());
        getAll();
    }

}