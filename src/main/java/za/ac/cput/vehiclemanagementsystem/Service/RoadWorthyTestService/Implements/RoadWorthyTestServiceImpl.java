package za.ac.cput.vehiclemanagementsystem.Service.RoadWorthyTestService.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.RoadWorthyTest.RoadWorthyTest;
import za.ac.cput.vehiclemanagementsystem.Repository.RoadWorthyTestRepository.Implements.RoadWorthyTestRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.RoadWorthyTestRepository.RoadWorthyTestRepository;
import za.ac.cput.vehiclemanagementsystem.Service.RoadWorthyTestService.RoadWorthyTestService;

import java.util.List;

@Service
public class RoadWorthyTestServiceImpl implements RoadWorthyTestService {

    @Autowired
    //@Qualifier("InMemory")

    private RoadWorthyTestServiceImpl service = null;
    private RoadWorthyTestRepository repository;

    private RoadWorthyTestServiceImpl()
    {
        this.repository = RoadWorthyTestRepositoryImplements.getRepository();
    }

    public RoadWorthyTestServiceImpl getService()
    {
        if (service == null)
        {
            service = new RoadWorthyTestServiceImpl();
        }
        return service;
    }

    @Override
    public List<RoadWorthyTest> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public RoadWorthyTest create(RoadWorthyTest roadWorthyTest)
    {
        return this.repository.create(roadWorthyTest);
    }

    @Override
    public RoadWorthyTest read(String s)
    {
        return this.repository.read(s);
    }

    @Override
    public RoadWorthyTest update(RoadWorthyTest roadWorthyTest) {
        return this.repository.update(roadWorthyTest);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }
}
