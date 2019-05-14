package za.ac.cput.vehiclemanagementsystem.Factory.Employee;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Employee;
import za.ac.cput.vehiclemanagementsystem.Factory.EmployeeFactory.EmployeeFactory;

public class EmployeeFactoryTest {
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = EmployeeFactory.getEmployee(114262, "Sizwe", "Ncikana");
    }

    @Test
    public void getEmployee() {
        Assert.assertEquals(employee.getEmpNumb(), employee.getEmpNumb());
    }

}