package za.ac.cput.vehiclemanagementsystem.Repository.PositionRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.Position.Position;
import za.ac.cput.vehiclemanagementsystem.Repository.PositionRepository.PositionRepository;

import java.util.*;

@Repository
public class PositionRepositoryImplement implements PositionRepository {

    private static PositionRepositoryImplement positionRepo = null;
    private Map<Integer, Position> positionMap;

    private PositionRepositoryImplement()
    {
        this.positionMap = new HashMap<>();
    }

    public static PositionRepositoryImplement getPosition()
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
        Collection<Position> positionCollection = this.positionMap.values();
        Set<Position> positionMap = new HashSet<>();
        positionMap.addAll(positionCollection);
        return positionMap;
    }

    @Override
    public Position create(Position position)
    {
        this.positionMap.put(position.getRoleID(), position);
        return position;

        /*this.licenseDiskSet.put(licenseDisk.getRegNumber(), licenseDisk);
        return licenseDisk;*/

    }

    @Override
    public Position read(Integer integer) {
        return this.positionMap.get(integer);
    }

    @Override
    public Position update(Position position) {
        this.positionMap.replace(position.getRoleID(), position);
        return position;
    }

    @Override
    public void delete(Integer integer) 
    {
        this.positionMap.remove(integer);
    }
}
