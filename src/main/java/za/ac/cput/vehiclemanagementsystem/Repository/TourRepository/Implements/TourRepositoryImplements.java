package za.ac.cput.vehiclemanagementsystem.Repository.TourRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.Tour.Tour;
import za.ac.cput.vehiclemanagementsystem.Repository.TourRepository.TourRepository;

import java.util.*;

@Repository
public class TourRepositoryImplements implements TourRepository {

    private static TourRepositoryImplements repository = null;
    private Map<Integer, Tour> tourMap;

    private TourRepositoryImplements()
    {
        this.tourMap = new HashMap<>();
    }

    public static TourRepositoryImplements getRepository()
    {
        if (repository == null)
        {
            repository = new TourRepositoryImplements();
        }
        return repository;
    }

    @Override
    public Set<Tour> getAll()
    {
        Collection <Tour> tourCollection = this.tourMap.values();
        Set <Tour> tourSet = new HashSet<>();
        tourSet.addAll(tourCollection);
        return tourSet;
    }

    @Override
    public Tour create(Tour tour) {
        this.tourMap.put(tour.getTourNo(), tour);
        return tour;
    }

    @Override
    public Tour read(String s) {
        return this.tourMap.get(s);
    }

    @Override
    public Tour update(Tour tour)
    {
        this.tourMap.replace(tour.getTourNo(), tour);
        return this.tourMap.get(tour.getTourNo());
    }

    @Override
    public void delete(String s)
    {
        this.tourMap.remove(s);
    }
}
