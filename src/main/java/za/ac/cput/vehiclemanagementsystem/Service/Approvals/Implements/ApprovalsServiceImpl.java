package za.ac.cput.vehiclemanagementsystem.Service.Approvals.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.Approvals.Approvals;
import za.ac.cput.vehiclemanagementsystem.Repository.ApprovalsRepository.ApprovalsRepository;
import za.ac.cput.vehiclemanagementsystem.Repository.ApprovalsRepository.Implements.ApprovalsRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Service.Approvals.ApprovalsService;

import java.util.List;

@Service
public class ApprovalsServiceImpl implements ApprovalsService {

    @Autowired
    @Qualifier("InMemory")

    private static ApprovalsServiceImpl service = null;
    private ApprovalsRepository repository;

    private ApprovalsServiceImpl()
    {
        this.repository = ApprovalsRepositoryImplements.getApprovals();
    }

    public static ApprovalsServiceImpl getService()
    {
        if(service == null)
        {
            service = new ApprovalsServiceImpl();
        }
        return service;
    }

    @Override
    public List<Approvals> getAll() {
        return null;
    }

    @Override
    public Approvals create(Approvals approvals) {
        return null;
    }

    @Override
    public Approvals read(String s) {
        return null;
    }

    @Override
    public Approvals update(Approvals approvals) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
