package za.ac.cput.vehiclemanagementsystem.Repository.RoadWorthyTestRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.RoadWorthyTest.RoadWorthyTest;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface RoadWorthyTestRepository extends ControlRepository<RoadWorthyTest, String> {
    List<RoadWorthyTest> getAll();
}
