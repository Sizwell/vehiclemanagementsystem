package za.ac.cput.vehiclemanagementsystem.Repository.PositionRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Position.Position;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.Set;

public interface PositionRepository extends ControlRepository<Position, Integer>
{
    Set<Position> getAll();
}
