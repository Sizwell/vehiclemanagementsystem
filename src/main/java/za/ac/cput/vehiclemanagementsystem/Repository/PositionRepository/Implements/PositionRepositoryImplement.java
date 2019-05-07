package za.ac.cput.vehiclemanagementsystem.Repository.PositionRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Repository.PositionRepository.PositionRepository;

import javax.swing.text.Position;
import java.util.HashSet;
import java.util.Set;

public class PositionRepositoryImplement implements PositionRepository {

    private static PositionRepositoryImplement positionRepo = null;
    private Set<Position> positionSet;

    private PositionRepositoryImplement()
    {
        this.positionSet = new HashSet<>();
    }

    public static PositionRepository getposition()
    {
        if(positionRepo == null)
        {
            positionRepo = new PositionRepositoryImplement();
        }
        return positionRepo;
    }

    @Override
    public Set<Position> getAll()
    {
        return this.positionSet;
    }

    @Override
    public Position create(Position position)
    {
        this.positionSet.add(position);
        return position;
    }

    @Override
    public Position read(Integer integer) {
        return null;
    }

    @Override
    public Position update(Position position) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }
}
