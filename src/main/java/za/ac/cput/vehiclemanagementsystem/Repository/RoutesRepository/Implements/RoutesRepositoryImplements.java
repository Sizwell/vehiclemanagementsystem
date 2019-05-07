package za.ac.cput.vehiclemanagementsystem.Repository.RoutesRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Routes.Routes;
import za.ac.cput.vehiclemanagementsystem.Repository.RoutesRepository.RoutesRepository;

import java.util.HashSet;
import java.util.Set;

public class RoutesRepositoryImplements implements RoutesRepository {

    private static RoutesRepositoryImplements routesRepo = null;
    private Set<Routes> routesSet;

    private RoutesRepositoryImplements()
    {
        this.routesSet = new HashSet<>();
    }

    public static RoutesRepository getRoutes()
    {
        if(routesRepo == null)
        {
            routesRepo = new RoutesRepositoryImplements();
        }
        return routesRepo;
    }

    @Override
    public Set<Routes> getAll()
    {
        return this.routesSet;
    }

    @Override
    public Routes create(Routes routes)
    {
        this.routesSet.add(routes);
        return routes;
    }

    @Override
    public Routes read(Integer integer) {
        return null;
    }

    @Override
    public Routes update(Routes routes) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}
