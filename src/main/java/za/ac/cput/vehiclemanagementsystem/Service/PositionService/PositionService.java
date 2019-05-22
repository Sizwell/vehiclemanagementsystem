package za.ac.cput.vehiclemanagementsystem.Service.PositionService;

import za.ac.cput.vehiclemanagementsystem.Domain.Position.Position;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.Set;

public interface PositionService extends ControlService<Position, Integer>
{
    Set <Position> getAll();
}
