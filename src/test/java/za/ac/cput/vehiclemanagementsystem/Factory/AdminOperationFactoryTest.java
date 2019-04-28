package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Factory.AdminOperationFactory;

public class AdminOperationFactoryTest {

    String name = "Odwa";
    String surname = "Ncikana";

    private AdminOperations adminOps;

    @Before
    public void setUp() throws Exception {
        adminOps = AdminOperationFactory.getValidation(name, surname);
    }

    @Test
    public void getName() {
        Assert.assertEquals(adminOps.getName(), name, "Odwa");
    }

    @Test
    public void getSurname() {
        Assert.assertEquals(adminOps.getSurname(), surname, "Ncikana");
    }

    @Test
    public void getValidation() {
        Assert.assertNotNull(adminOps.getName(), adminOps.getSurname());
    }

}