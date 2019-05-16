package za.ac.cput.vehiclemanagementsystem.Domain.Login;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Login {
    private String username;
    private String password;
    private String errorMessage;

    private Login() {

    }

    private Login(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.errorMessage = builder.errorMsg;
    }


    public static class Builder {
        private String username;
        private String password;
        private String errorMsg;

        public Builder username(String name) {
            this.username = name;
            return this;
        }

        public Builder password(String pass) {
            this.password = pass;
            return this;
        }

        public Builder errorMessage(String msg) {
            this.errorMsg = msg;
            return this;
        }

        public Builder copyCredentials(Login login)
        {
            this.username = login.username;
            this.password = login.password;

            return this;
        }

        public Login build() {
            return new Login(this);
        }


    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getErrorMessage() {
        return errorMessage;
    }


    @Override
    public String toString() {
        return "**** Login ****\n" +
                "\nUsername: '" + getUsername() + '\'' +
                "\nPassword: '" + getPassword() + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Login)) return false;
        Login login = (Login) o;
        return username.equals(login.username) &&
                password.equals(login.password) &&
                Objects.equals(errorMessage, login.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, errorMessage);
    }
}
