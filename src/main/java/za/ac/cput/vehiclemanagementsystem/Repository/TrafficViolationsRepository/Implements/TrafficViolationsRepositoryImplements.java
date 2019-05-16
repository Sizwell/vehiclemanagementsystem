package za.ac.cput.vehiclemanagementsystem.Repository.TrafficViolationsRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Tracker.Tracker;
import za.ac.cput.vehiclemanagementsystem.Domain.TrafficViolations.TrafficViolations;
import za.ac.cput.vehiclemanagementsystem.Factory.TrafficViolationsFactory.TrafficViolationsFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.TrafficViolationsRepository.TrafficViolationsRepository;

import java.util.ArrayList;
import java.util.List;

public class TrafficViolationsRepositoryImplements implements TrafficViolationsRepository {

   private static TrafficViolationsRepositoryImplements repository = null;
   private List <TrafficViolations> trafficViolationsList;

   private TrafficViolationsRepositoryImplements()
   {
       this.trafficViolationsList = new ArrayList<>();
   }

   private TrafficViolations findViolations(String vioId)
   {
       return this.trafficViolationsList.stream().filter(trafficViolations -> trafficViolations.getViolationNo().trim()
               .equals(vioId))
               .findAny()
               .orElse(null);
   }

   public static TrafficViolationsRepositoryImplements getViolation()
   {
       if (repository == null)
       {
           repository = new TrafficViolationsRepositoryImplements();
       }
       return repository;
   }

    @Override
    public List<TrafficViolations> getAll()
    {
        return this.trafficViolationsList;
    }

    @Override
    public TrafficViolations create(TrafficViolations trafficViolations)
    {
        this.trafficViolationsList.add(trafficViolations);
        return trafficViolations;
    }

    @Override
    public TrafficViolations read(String s)
    {
        TrafficViolations read = findViolations(s);
        return read;
    }

    @Override
    public TrafficViolations update(TrafficViolations trafficViolations)
    {
        TrafficViolations toUpdate = findViolations(trafficViolations.getViolationNo());
        if (toUpdate != null)
        {
            this.trafficViolationsList.remove(toUpdate);
            return create(trafficViolations);
        }
        return null;
    }

    @Override
    public void delete(String t)
    {
         TrafficViolations violations = findViolations(t);
        if (violations != null)
        {
            this.trafficViolationsList.remove(violations);
        }
    }
}
