package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.RoadWorthyTest;

import java.util.List;

public interface RoadWorthyTestRepository extends ControlRepository<RoadWorthyTest, String>{
    List<RoadWorthyTest> getAll();
}
