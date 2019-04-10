package za.ac.cput.vehiclemanagementsystem.Domain;

import javafx.util.Builder;

public class Login {
    private String username;
    private String password;

    private Login()
    {

    }

    private Login(Builder builder)
    {
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }


    public static class Builder
    {
        private String username;
        private String password;



    }


}
