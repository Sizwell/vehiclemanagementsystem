package za.ac.cput.vehiclemanagementsystem.Service.RoutesService.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Routes.Routes;
import za.ac.cput.vehiclemanagementsystem.Factory.RoutesFactory.RouteFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.RoutesRepository.Implements.RoutesRepositoryImplements;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoutesServiceImplTest {

    private RoutesRepositoryImplements repository;
    private Routes routes;
    

    private Routes getRoutes()
    {
        return this.repository.getAll().iterator().next();
    }


    @Before
    public void setUp() throws Exception 
    {
        this.repository = RoutesRepositoryImplements.getRoutes();
        this.routes = RouteFactory.getDeduction(2345, "R56", "Maclear's Beacon");
    }

    @Test
    public void getAll() 
    {
        Set<Routes> routesSet = this.repository.getAll();
    }

    @Test
    public void create()
    {
        Routes toCreate = this.repository.create(this.routes);
        System.out.println("Creating Tour Routes...\n" + toCreate);

        Assert.assertSame(toCreate, this.routes);
        //  Assert.assertNotNull(toCreate);
    }

    @Test
    public void read()
    {
        Routes toRead = getRoutes();
        Routes read = this.repository.read(toRead.getRouteNo());

        System.out.println("Reading Tour Routes...\n" + read);
        Assert.assertSame(toRead, read);
    }

    @Test
    public void update()
    {
        String newDestination = "Touring Maclear's Beacon";
        Routes updater = new Routes.Builder().copyRoutes(getRoutes()).destination(newDestination).build();
        System.out.println("Updating Routes...\n" + updater);

        this.repository.update(updater);
        Assert.assertSame(newDestination, updater.getDestination());
    }

    @Ignore
    @Test
    public void delete()
    {
        Routes toDelete = getRoutes();

        Routes delete = this.repository.read(toDelete.getRouteNo());
        System.out.println("Deleting Routes...\n" + delete);
    }
}