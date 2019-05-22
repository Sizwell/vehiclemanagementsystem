package za.ac.cput.vehiclemanagementsystem.Service.EmployeeManagement.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement.EmployeeManagement;
import za.ac.cput.vehiclemanagementsystem.Factory.EmployeeManagementFactory.EmployeeManagementFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeManagementRepository.EmployeeManagementRepository;
import za.ac.cput.vehiclemanagementsystem.Repository.EmployeeManagementRepository.Implements.EmployeeManagementRepoImplement;

import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class EmployeeManagementVehicleServiceImplTest {

   private EmployeeManagementRepoImplement repository;
   private EmployeeManagement management;


    private EmployeeManagement getManagement()
    {
        return this.repository.getAll().listIterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = EmployeeManagementRepoImplement.getEmployeesRepository();
        this.management = EmployeeManagementFactory.manageEmployee("3521", "Sylvia", "Manage Employees");
    }

    @Test
    public void getAll()
    {
        List<EmployeeManagement> employeeManagement = this.repository.getAll();
        System.out.println("Retrieving all Employee Management Data...\n" + employeeManagement);
    }

    @Test
    public void create()
    {
        EmployeeManagement create = this.repository.create(this.management);
        System.out.println("Creating Employee Management...\n");

        Assert.assertNotNull(create);
        Assert.assertSame(create, this.management);
    }

    @Test
    public void read()
    {
        EmployeeManagement read = getManagement();
        EmployeeManagement reader = this.repository.read(read.getTaskID());

        System.out.println("Reading Task Management...\n" + reader);
        Assert.assertSame(reader, read);
    }

    @Test
    public void update()
    {
        String newTask = "Supervise Employees";

        EmployeeManagement updated = new EmployeeManagement.Builder().copyTask(getManagement()).empTasks(newTask).build();
        System.out.println("On task Update...\n" + updated);

        this.repository.update(updated);

        Assert.assertSame(newTask, updated.getEmpTasks());
    }
    @Ignore
    @Test
    public void delete()
    {
        EmployeeManagement toDelete = getManagement();
        this.repository.delete(toDelete.getTaskID());
        getAll();
    }
}