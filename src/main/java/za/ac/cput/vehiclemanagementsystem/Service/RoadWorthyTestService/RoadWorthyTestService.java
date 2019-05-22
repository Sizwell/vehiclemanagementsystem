package za.ac.cput.vehiclemanagementsystem.Service.RoadWorthyTestService;

import za.ac.cput.vehiclemanagementsystem.Domain.RoadWorthyTest.RoadWorthyTest;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.List;

public interface RoadWorthyTestService extends ControlService <RoadWorthyTest, String>
{
    List<RoadWorthyTest> getAll();
}
