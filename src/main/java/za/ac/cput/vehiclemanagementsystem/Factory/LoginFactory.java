package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Login;

public class LoginFactory {

    public static Login getLogin(String username, String password)
    {

        return new Login.Builder()
                .username(username)
                .password(password)
                .build();
    }
}
