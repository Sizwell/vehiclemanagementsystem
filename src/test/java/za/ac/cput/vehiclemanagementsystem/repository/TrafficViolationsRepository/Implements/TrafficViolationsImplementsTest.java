package za.ac.cput.vehiclemanagementsystem.repository.TrafficViolationsRepository.Implements;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.TrafficViolations.TrafficViolations;
import za.ac.cput.vehiclemanagementsystem.Factory.TrafficViolationsFactory.TrafficViolationsFactory;

import static org.junit.Assert.*;

public class TrafficViolationsImplementsTest {

    private TrafficViolations trafficViolations;
    private TrafficViolations trafficViolationsEmp;

    @Before
    public void setUp() throws Exception {
        trafficViolations = TrafficViolationsFactory.getViolation(2352, "Over Speeding");
        trafficViolationsEmp = TrafficViolationsFactory.getViolation(2012, "Seat belt");
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
    public void delete() {
    }
}