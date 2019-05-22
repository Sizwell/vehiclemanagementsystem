package za.ac.cput.vehiclemanagementsystem.Service.VehicleHistoryService.Implements;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.cput.vehiclemanagementsystem.Domain.Vehicle.Vehicle;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleHistory.VehicleHistory;
import za.ac.cput.vehiclemanagementsystem.Factory.VehicleHistoryFactory.VehicleHistoryFactory;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleHistoryRepository.Implements.VehicleHistoryRepositoryImplements;

import java.util.List;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class VehicleHistoryServiceImplTest {
    
    private VehicleHistoryRepositoryImplements repository;
    private VehicleHistory history;
    
    private VehicleHistory getHistory()
    {
        return this.repository.getHistory().listIterator().next();
    }

    @Before
    public void setUp() throws Exception 
    {
        this.repository = VehicleHistoryRepositoryImplements.getRepository();
        this.history = VehicleHistoryFactory
                .vehicleHistory("H05", "bus", "Bus has been on several tours Around the Cape Peninsula");
    }

    @Test
    public void getAll() 
    {
        List <VehicleHistory> vehicleHistoryList = this.repository.getHistory();
        System.out.println("Getting Vehicle History...\n" + vehicleHistoryList);
    }

    @Test
    public void create() 
    {
        VehicleHistory toCreate = this.repository.create(this.history);
        System.out.println("Creating Vehicle History...\n" + toCreate);

        Assert.assertNotNull(toCreate);
        Assert.assertSame(toCreate, this.history);
    }

    @Test
    public void read() 
    {
        VehicleHistory toRead = getHistory();

        VehicleHistory read = this.repository.read(toRead.getHistoryNo());
        System.out.println("Reading Vehicle History...\n" + read);
        
        Assert.assertSame(toRead, read);
    }

    @Test
    public void update() 
    {
        String historyUpdate = "Bus has been on multiple tours Around the Cape Peninsula since its arrival";
        
        VehicleHistory update = new VehicleHistory.Builder().copyVH(getHistory()).vehHistory(historyUpdate).build();
        System.out.println("Updating Vehicle History...\n" + update);
        
        this.repository.update(update);
        
        Assert.assertSame(historyUpdate, update.getHistory());
    }

    @Ignore
    @Test
    public void delete()
    {
        VehicleHistory toDelete = getHistory();
        this.repository.delete(toDelete.getHistoryNo());
    }
}