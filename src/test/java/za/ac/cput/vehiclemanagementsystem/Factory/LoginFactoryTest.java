package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Login;

import static org.junit.Assert.*;

public class LoginFactoryTest {

    @Test
    public void getLogin()
    {
        String username = "Sizwe";
        String password = "Ncikana";
        //Login login = LoginFactory.getLogin(username);
        Login login = LoginFactory.getLogin(username, password);
        System.out.println(login);
        Assert.assertNotNull(login.getUsername(), login.getPassword());
    }
}