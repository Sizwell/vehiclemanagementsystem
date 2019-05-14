package za.ac.cput.vehiclemanagementsystem.Factory.Login;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Login.Login;
import za.ac.cput.vehiclemanagementsystem.Factory.LoginFactory.LoginFactory;

public class LoginFactoryTest {

    private String username = "Sizwe";
    private String password = "Ncikana";
    private String error = "Access denied. Please try again or contact your administrator";

    @Test
    public void getLogin() {

        Login login = LoginFactory.getLogin(username, password);
        System.out.println(login);
        Assert.assertNotNull(login.getUsername(), login.getPassword());
        // Assert.assertNull(login.getErrorMessage());
        //  Assert.assertEquals(login.getUsername(), login.getPassword());
    }
}