package za.ac.cput.vehiclemanagementsystem.repository.ReportRepository.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Report.Report;
import za.ac.cput.vehiclemanagementsystem.Factory.ReportFactory.ReportFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.ReportRepository.Implements.ReportRepositoryImplement;
import za.ac.cput.vehiclemanagementsystem.Repository.ReportRepository.ReportRepository;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReportRepositoryImplementTest {

    private ReportRepository repository;
    private Report report;

    private Report getReport()
    {
        Set<Report> reportSet = this.repository.getAll();
        return reportSet.iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repository = ReportRepositoryImplement.getRepository();
        this.report = ReportFactory.getReport("378", "Tour took the whole day");
    }


    @Test
    public void create()
    {
        Report toCreate = this.repository.create(this.report);
        System.out.println("Creating Report...\n" + toCreate);

        getAll();
        Assert.assertNotSame(toCreate, this.report);
    }

    @Test
    public void read()
    {
        Report savedReport = getReport();
        System.out.println("About to read report...\n" + savedReport);

        Report read = this.repository.read(savedReport.getReportID());
        System.out.println("Reading Report...\n" + read);
        getAll();
        Assert.assertEquals(savedReport, read);
    }

    @Test
    public void update()
    {
        String report = "Toured around Camps bay all day on Saturday";
        Report toUpdate = new Report.Builder().copyReport(getReport()).tourDetails(report).build();
        System.out.println("On tour Update...\n" + toUpdate);

        Report updated = this.repository.update(toUpdate);
        System.out.println("Tour Report has been Updated...\n" + updated);
        Assert.assertSame(report, updated.getTourDetails());

        getAll();
    }

    @Ignore
    @Test
    public void delete()
    {
        Report toDelete = getReport();
        this.repository.delete(toDelete.getReportID());

        getAll();
    }

    @Test
    public void getAll()
    {
        Set<Report> getAll = this.repository.getAll();
        System.out.println("To get all repositories...\n" + getAll);
    }

}