package za.ac.cput.vehiclemanagementsystem.Factory.TrafficViolations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.TrafficViolations.TrafficViolations;
import za.ac.cput.vehiclemanagementsystem.Factory.TrafficViolationsFactory.TrafficViolationsFactory;

public class TrafficViolationsFactoryTest {

    private TrafficViolations trafficViolations;
    private TrafficViolations trafficViolationsEmp;

    @Before
    public void setUp() throws Exception {
        trafficViolations = TrafficViolationsFactory.getViolation("2352", "Over Speeding");
        trafficViolationsEmp = TrafficViolationsFactory.getViolation("2012", "Seat belt");
    }

    @Test
    public void getCheckOut() {
        Assert.assertNotNull(trafficViolations);
    }

    @Test
    public void getEmpNo() {
        Assert.assertNotEquals(trafficViolations, trafficViolationsEmp);
    }
}