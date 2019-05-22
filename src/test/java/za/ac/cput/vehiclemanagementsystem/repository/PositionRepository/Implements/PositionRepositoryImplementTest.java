package za.ac.cput.vehiclemanagementsystem.repository.PositionRepository.Implements;

import javafx.geometry.Pos;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Position.Position;
import za.ac.cput.vehiclemanagementsystem.Factory.Position.PositionFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.PositionRepository.Implements.PositionRepositoryImplement;
import za.ac.cput.vehiclemanagementsystem.Repository.PositionRepository.PositionRepository;


import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PositionRepositoryImplementTest {

    private PositionRepository repository;
    private Position position;


    @Before
    public void setUp() throws Exception
    {
        this.repository = PositionRepositoryImplement.getPosition();
        this.position = PositionFactory.getFactory(5228, "Supervisor");
    }

    @Test
    public void getPosition()
    {

    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
    }

    @Test
    public void read() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete()
    {

    }
}