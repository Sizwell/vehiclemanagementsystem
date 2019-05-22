package za.ac.cput.vehiclemanagementsystem.Repository.RoadWorthyTestRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.RoadWorthyTest.RoadWorthyTest;
import za.ac.cput.vehiclemanagementsystem.Repository.RoadWorthyTestRepository.RoadWorthyTestRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RoadWorthyTestRepositoryImplements implements RoadWorthyTestRepository {
    
    private static RoadWorthyTestRepositoryImplements roadWorthyRepository = null;
    
    private List<RoadWorthyTest> roadWorthyList;
    
    private RoadWorthyTestRepositoryImplements()
    {
        this.roadWorthyList = new ArrayList<>();
    }

    public RoadWorthyTest getRoadWorthyTest(String vin)
    {
        return this.roadWorthyList.stream()
                .filter(roadWorthyTest -> roadWorthyTest.getVinNo().trim().equals(vin))
                .findAny()
                .orElse(null);
    }

    public static RoadWorthyTestRepositoryImplements getRepository()
    {
        if (roadWorthyRepository == null)
        {
            roadWorthyRepository = new RoadWorthyTestRepositoryImplements();
        }
        return roadWorthyRepository;
    }
    
   
    @Override
    public List<RoadWorthyTest> getAll() 
    {
        return this.roadWorthyList;
    }

    @Override
    public RoadWorthyTest create(RoadWorthyTest roadWorthyTest) 
    {
        this.roadWorthyList.add(roadWorthyTest);
        return roadWorthyTest;
    }

    @Override
    public RoadWorthyTest read(String s) {
        RoadWorthyTest test = getRoadWorthyTest(s);
        return test;
    }

    @Override
    public RoadWorthyTest update(RoadWorthyTest roadWorthyTest)
    {
       RoadWorthyTest toUpdate = getRoadWorthyTest(roadWorthyTest.getVinNo());
       if (toUpdate != null)
       {
           this.roadWorthyList.remove(toUpdate);
       }
       return toUpdate;
    }

    @Override
    public void delete(String delete)
    {
        RoadWorthyTest toDelete = getRoadWorthyTest(delete);
        if (toDelete != null)
        {
            this.roadWorthyList.remove(toDelete);
        }
    }
}
