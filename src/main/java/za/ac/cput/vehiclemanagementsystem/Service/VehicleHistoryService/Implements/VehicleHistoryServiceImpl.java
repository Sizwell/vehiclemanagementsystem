package za.ac.cput.vehiclemanagementsystem.Service.VehicleHistoryService.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.VehicleHistory.VehicleHistory;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleHistoryRepository.Implements.VehicleHistoryRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.VehicleHistoryRepository.VehicleHistoryRepository;
import za.ac.cput.vehiclemanagementsystem.Service.VehicleHistoryService.VehicleHistoryService;

import java.util.List;

@Service
public class VehicleHistoryServiceImpl implements VehicleHistoryService {

    @Autowired
    @Qualifier("InMemory")

    private static VehicleHistoryServiceImpl service = null;
    private VehicleHistoryRepository repository;

    public static VehicleHistoryServiceImpl getService()
    {
        if (service == null)
        {
            service = new VehicleHistoryServiceImpl();
        }
        return service;
    }

    private VehicleHistoryServiceImpl()
    {
        this.repository = VehicleHistoryRepositoryImplements.getRepository();
    }

    @Override
    public List<VehicleHistory> getAll() {
        return this.repository.getHistory();
    }

    @Override
    public VehicleHistory create(VehicleHistory vehicleHistory)
    {
        return this.repository.create(vehicleHistory);
    }

    @Override
    public VehicleHistory read(String s)
    {
        return this.repository.read(s);
    }

    @Override
    public VehicleHistory update(VehicleHistory vehicleHistory)
    {
        return this.repository.update(vehicleHistory);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }
}
