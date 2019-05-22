package za.ac.cput.vehiclemanagementsystem.repository.RoutesRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Routes.Routes;
import za.ac.cput.vehiclemanagementsystem.Factory.RoutesFactory.RouteFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.RoutesRepository.Implements.RoutesRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.RoutesRepository.RoutesRepository;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RoutesRepositoryImplementsTest {

    private RoutesRepository repository;
    private Routes routes;

    private Routes getSavedRoutes()
    {
        Set<Routes> routesSet = this.repository.getAll();
        return routesSet.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = RoutesRepositoryImplements.getRoutes();
        this.routes = RouteFactory.getDeduction(856, "R007", "Castle of Good Hope");
    }

    @Test
    public void create()
    {
        Routes toCreate = this.repository.create(this.routes);
        System.out.println("Creating Route...\n" + toCreate);
        getAll();
        Assert.assertSame(toCreate, this.routes);
    }

    @Test
    public void read()
    {
        Routes savedRoutes = getSavedRoutes();
        System.out.println("To read all routes...\n" + savedRoutes.getRouteNo());

        Routes read = this.repository.read(savedRoutes.getRouteNo());
        System.out.println("Reading routes...\n" + read);
        getAll();
        Assert.assertEquals(savedRoutes, read);
    }

    @Test
    public void update()
    {
        Routes toUpdate = getSavedRoutes();
        System.out.println("About to Update Routes...\n" + toUpdate.getRouteNo());

        Routes updating = this.repository.read(toUpdate.getRouteNo());
        System.out.println("Routes updating...\n" + updating);

        getAll();
        Assert.assertEquals(toUpdate, updating);
    }

    @Ignore
    @Test
    public void delete()
    {
        Routes toDelete = getSavedRoutes();
        this.repository.delete(toDelete.getRouteNo());
        getAll();
    }
    @Test
    public void getAll()
    {
        Set<Routes> allRoutes = this.repository.getAll();
        System.out.println("Getting all Routes...\n" + allRoutes);
    }
}