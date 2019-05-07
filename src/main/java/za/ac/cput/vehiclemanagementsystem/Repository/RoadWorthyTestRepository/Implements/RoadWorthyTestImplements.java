package za.ac.cput.vehiclemanagementsystem.Repository.RoadWorthyTestRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.RoadWorthyTest.RoadWorthyTest;
import za.ac.cput.vehiclemanagementsystem.Repository.RoadWorthyTestRepository.RoadWorthyTestRepository;

import java.util.ArrayList;
import java.util.List;

public class RoadWorthyTestImplements implements RoadWorthyTestRepository {
    
    private static RoadWorthyTestImplements roadWorthyRepository = null;
    
    private List<RoadWorthyTest> roadWorthyList;
    
    private RoadWorthyTestImplements()
    {
        this.roadWorthyList = new ArrayList<>();
    }
    
    public static RoadWorthyTestRepository getRepository()
    {
        if (roadWorthyRepository == null)
        {
            roadWorthyRepository = new RoadWorthyTestImplements();
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
        return null;
    }

    @Override
    public RoadWorthyTest update(RoadWorthyTest roadWorthyTest)
    {
        String a = roadWorthyTest.getVinNo();
        int b = Integer.parseInt(a);
        this.roadWorthyList.get(b);

        this.roadWorthyList.add(roadWorthyTest);
        return roadWorthyTest;
    }

    @Override
    public void delete(String delete)
    {
        int a = this.roadWorthyList.size();
        int b = roadWorthyList.indexOf(a);
        roadWorthyList.remove(b);
    }
}
