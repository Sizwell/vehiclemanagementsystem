package za.ac.cput.vehiclemanagementsystem.Security;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class VehicleManagementSecurity extends WebSecurityConfigurerAdapter
{
    private static final String USER_ROLE = "USER";
    private static final String ADMIN_ROLE = "ADMIN";

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth
                .inMemoryAuthentication()
                .withUser("user1")
                .password(encoder().encode("password"))
                .roles(USER_ROLE)
                .and()
                .withUser("admin")
                .password(encoder().encode("admin1"))
                .roles(USER_ROLE, ADMIN_ROLE);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception
    {
        http
                //.httpBasic()
                //.and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/vehiclemanagement/lookup/**create/**").hasRole(ADMIN_ROLE)
              //  .antMatchers(HttpMethod.GET, "/vehiclemanagement/lookup/**read/**").hasAnyRole(ADMIN_ROLE, USER_ROLE)
                .antMatchers(HttpMethod.GET, "/vehiclemanagement/lookup/**read/**").hasRole(USER_ROLE)
                .and()
                //.csrf().disable()
                .formLogin();//.disable();
    }

    @Bean
    public PasswordEncoder encoder()
    {
        return new BCryptPasswordEncoder();
    }

}
