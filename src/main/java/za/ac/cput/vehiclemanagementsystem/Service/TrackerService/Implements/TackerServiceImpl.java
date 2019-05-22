package za.ac.cput.vehiclemanagementsystem.Service.TrackerService.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.Tracker.Tracker;
import za.ac.cput.vehiclemanagementsystem.Repository.TrackerRepository.Implements.TrackerRepoImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.TrackerRepository.TrackerRepository;
import za.ac.cput.vehiclemanagementsystem.Service.TrackerService.TrackerService;

import java.util.List;

@Service
public class TackerServiceImpl implements TrackerService {

    @Autowired
    @Qualifier("InMemory")

    private static TackerServiceImpl service = null;
    private TrackerRepository repository;

    private TackerServiceImpl()
    {
        this.repository = TrackerRepoImplements.getTracker();
    }

    @Override
    public List<Tracker> getAll() {
        return this.repository.getAll();
    }

    public static TackerServiceImpl getService()
    {
        if (service == null)
        {
            service = new TackerServiceImpl();
        }
        return service;
    }

    @Override
    public Tracker create(Tracker tracker)
    {
        return this.repository.create(tracker);
    }

    @Override
    public Tracker read(String s)
    {
        return this.repository.read(s);
    }

    @Override
    public Tracker update(Tracker tracker)
    {
        return this.repository.update(tracker);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }
}
