package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Report;
import za.ac.cput.vehiclemanagementsystem.Factory.ReportFactory;

import static org.junit.Assert.*;

public class ReportFactoryTest {

    private Report report;

    @Before
    public void setUp() throws Exception
    {
        report = ReportFactory.getReport("Tour Report");
    }

    @Test
    public void getReport()
    {
        Assert.assertNotNull(report);
        System.out.println(report.toString());
    }
}