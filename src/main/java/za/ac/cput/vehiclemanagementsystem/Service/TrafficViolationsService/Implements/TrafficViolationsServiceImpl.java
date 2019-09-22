package za.ac.cput.vehiclemanagementsystem.Service.TrafficViolationsService.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.TrafficViolations.TrafficViolations;
import za.ac.cput.vehiclemanagementsystem.Repository.TrafficViolationsRepository.Implements.TrafficViolationsRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.TrafficViolationsRepository.TrafficViolationsRepository;
import za.ac.cput.vehiclemanagementsystem.Service.TrafficViolationsService.TrafficViolationsService;

import java.util.List;

@Service
public class TrafficViolationsServiceImpl implements TrafficViolationsService {

    @Autowired
   // @Qualifier("InMemory")

    private TrafficViolationsServiceImpl service = null;
    private TrafficViolationsRepository repository;

    private TrafficViolationsServiceImpl()
    {
        this.repository = TrafficViolationsRepositoryImplements.getViolation();
    }

    public TrafficViolationsServiceImpl getService()
    {
        if (service == null)
        {
            service = new TrafficViolationsServiceImpl();
        }
        return service;
    }

    @Override
    public List<TrafficViolations> getAll() {
        return this.repository.getAll();
    }

    @Override
    public TrafficViolations create(TrafficViolations trafficViolations) {
        return this.repository.create(trafficViolations);
    }

    @Override
    public TrafficViolations read(String s) {
        return this.repository.read(s);
    }

    @Override
    public TrafficViolations update(TrafficViolations trafficViolations) {
        return this.repository.update(trafficViolations);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }
}
