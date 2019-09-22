package za.ac.cput.vehiclemanagementsystem.Service.RoutesService.Implements;

import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.Routes.Routes;
import za.ac.cput.vehiclemanagementsystem.Repository.RoutesRepository.Implements.RoutesRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.RoutesRepository.RoutesRepository;
import za.ac.cput.vehiclemanagementsystem.Service.RoutesService.RoutesService;

import java.util.Set;

@Service
public class RoutesServiceImpl implements RoutesService {


    private RoutesServiceImpl service = null;
    private RoutesRepository repository;

    private RoutesServiceImpl()
    {
        this.repository = RoutesRepositoryImplements.getRoutes();
    }

    public RoutesServiceImpl getService()
    {
        if (service == null)
        {
            service = new RoutesServiceImpl();
        }
        return service;
    }
    
    @Override
    public Set<Routes> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Routes create(Routes routes) {
        return this.repository.create(routes);
    }

    @Override
    public Routes read(Integer integer) {
        return this.repository.read(integer);
    }

    @Override
    public Routes update(Routes routes) {
        return this.repository.update(routes);
    }

    @Override
    public void delete(Integer integer) {
        this.repository.delete(integer);
    }
}
