package za.ac.cput.vehiclemanagementsystem.Service.TourService.Implements;

import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.Tour.Tour;
import za.ac.cput.vehiclemanagementsystem.Repository.TourRepository.Implements.TourRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.TourRepository.TourRepository;
import za.ac.cput.vehiclemanagementsystem.Service.TourService.TourService;

import java.util.Set;

@Service
public class TourServiceImpl implements TourService {


    private TourServiceImpl service = null;
    private TourRepository repository;

    private TourServiceImpl()
    {
        this.repository = TourRepositoryImplements.getRepository();
    }

    public TourServiceImpl getService()
    {
        if (service == null)
        {
            service = new TourServiceImpl();
        }
        return service;
    }
    
    @Override
    public Set<Tour> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Tour create(Tour tour) {
        return this.repository.create(tour);
    }

    @Override
    public Tour read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Tour update(Tour tour) {
        return this.repository.update(tour);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
