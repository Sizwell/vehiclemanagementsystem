package za.ac.cput.vehiclemanagementsystem.Repository.RoutesRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.Routes.Routes;
import za.ac.cput.vehiclemanagementsystem.Repository.RoutesRepository.RoutesRepository;

import java.util.*;

@Repository
public class RoutesRepositoryImplements implements RoutesRepository {

    private static RoutesRepositoryImplements routesRepo = null;
    private Map<Integer, Routes> routesMap;

    private RoutesRepositoryImplements()
    {
        this.routesMap = new HashMap<>();
    }

    public static RoutesRepositoryImplements getRoutes()
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
        Collection <Routes> routesCollection = this.routesMap.values();
        Set <Routes> routesSet = new HashSet<>();
        routesSet.addAll(routesCollection);
        return routesSet;
    }

    @Override
    public Routes create(Routes routes)
    {
        this.routesMap.put(routes.getRouteNo(), routes);
        return routes;
    }

    @Override
    public Routes read(Integer integer) {
        return this.routesMap.get(integer);
    }

    @Override
    public Routes update(Routes routes) {
        this.routesMap.replace(routes.getRouteNo(), routes);
        return this.routesMap.get(routes.getRouteNo());
    }

    @Override
    public void delete(Integer integer)
    {
        this.routesMap.remove(integer);
    }
}
