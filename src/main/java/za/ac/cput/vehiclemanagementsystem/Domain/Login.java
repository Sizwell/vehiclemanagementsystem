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

        public Builder username(String name)
        {
            this.username = name;
            return this;
        }

        public Builder password(String pass)
        {
            this.password = pass;
            return this;
        }

        public Login build()
        {
            return new Login(this);
        }


    }

    public String toString()
    {
        String str = "**** Login ****\n" + "\t Username: " + username + "Password: " + password;
        return str;
    }


}
