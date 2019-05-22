package za.ac.cput.vehiclemanagementsystem.Service.PositionService.Implements;

import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.Position.Position;
import za.ac.cput.vehiclemanagementsystem.Repository.PositionRepository.Implements.PositionRepositoryImplement;
import za.ac.cput.vehiclemanagementsystem.Repository.PositionRepository.PositionRepository;
import za.ac.cput.vehiclemanagementsystem.Service.PositionService.PositionService;

import java.util.Set;

@Service
public class PositionServiceImpl implements PositionService {

    private static PositionServiceImpl service = null;
    private PositionRepository repository;

    private PositionServiceImpl()
    {
        this.repository = PositionRepositoryImplement.getPosition();
    }

    public static PositionServiceImpl getService()
    {
        if (service == null)
        {
            service = new PositionServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Position> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Position create(Position position) {
        return this.repository.create(position);
    }

    @Override
    public Position read(Integer integer) {
        return this.repository.read(integer);
    }

    @Override
    public Position update(Position position) {
        return this.repository.update(position);
    }

    @Override
    public void delete(Integer integer)
    {
        this.repository.delete(integer);
    }
}
