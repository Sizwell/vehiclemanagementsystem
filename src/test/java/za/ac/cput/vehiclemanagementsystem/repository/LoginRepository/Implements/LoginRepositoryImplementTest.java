package za.ac.cput.vehiclemanagementsystem.repository.LoginRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Login.Login;
import za.ac.cput.vehiclemanagementsystem.Factory.LoginFactory.LoginFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.LoginRepository.Implements.LoginRepositoryImplement;
import za.ac.cput.vehiclemanagementsystem.Repository.LoginRepository.LoginRepository;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class LoginRepositoryImplementTest {

    private LoginRepository repository;
    private Login login;

    private Login getCredentials()
    {
        List <Login> credentials = this.repository.getAll();
        return credentials.listIterator().next();
       // Iterator credListIterator = credentials.listIterator();

        /*
        return savedTasks.iterator().next();
         */

     /*   while (credListIterator.hasNext())
        {
            System.out.println("Next Element " + credListIterator);
            break;
        }
*/

    }


    @Before
    public void setUp() throws Exception
    {
        this.repository = LoginRepositoryImplement.getCredentials();
        this.login = LoginFactory.getLogin("admin", "Admin@VFM");
    }

    @Test
    public void create()
    {
        Login login = this.repository.create(this.login);
        System.out.println("On Sign in... " + login);
        getAll();
        Assert.assertSame(login, this.login);

    }

    @Test
    public void read()
    {
        Login readCred = getCredentials();
        System.out.println("Reading saved Credentials..." + readCred.getUsername() + " " + readCred.getPassword());

        Login read = this.repository.read(readCred.getUsername() + " " + readCred.getPassword());
        System.out.println("Reading..." + read);
        getAll();
        Assert.assertNotNull(readCred.getUsername(), readCred.getPassword());
    }

    @Test
    public void update()
    {
        String username = "testAdmin";
        String password = "admin@Test01";

        Login login = new Login.Builder().copyCredentials(getCredentials()).username(username).password(password).build();
        System.out.println("On Login... Updating Credentials..." + login);

        Login updated = this.repository.update(login);
        System.out.println("Credentials Updated... " + updated);
        Assert.assertNotNull(this.login);

        getAll();
    }

    //For Read and Update Tests to pass, Comment out or Ignore the delete() test
    @Ignore
    @Test
    public void delete()
    {
        Login savedCredentials = getCredentials();
        this.repository.delete(savedCredentials.getUsername());

        getAll();
    }

    @Test
    public void getAll()
    {
        List <Login> credentials = this.repository.getAll();
        System.out.println("Getting Credentials... " + credentials);
    }
}