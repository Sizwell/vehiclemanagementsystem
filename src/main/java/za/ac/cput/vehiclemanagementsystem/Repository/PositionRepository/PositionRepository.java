package za.ac.cput.vehiclemanagementsystem.Repository.PositionRepository;

import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import javax.swing.text.Position;
import java.util.Set;

public interface PositionRepository extends ControlRepository<Position, Integer>
{
    Set <Position> getAll();
}
