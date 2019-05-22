package za.ac.cput.vehiclemanagementsystem.Repository.ApprovalsRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.Approvals.Approvals;
import za.ac.cput.vehiclemanagementsystem.Domain.Login.Login;
import za.ac.cput.vehiclemanagementsystem.Repository.ApprovalsRepository.ApprovalsRepository;

import java.util.*;

@Repository
public class ApprovalsRepositoryImplements implements ApprovalsRepository {

    private static ApprovalsRepositoryImplements approvalsRepository = null;
    private Map<String, Approvals> approvalsMap;

    private ApprovalsRepositoryImplements()
    {
        this.approvalsMap = new HashMap<>();
    }

    public static ApprovalsRepositoryImplements getApprovals()
    {
        if(approvalsRepository == null)
        {
            approvalsRepository = new ApprovalsRepositoryImplements();
        }
        return approvalsRepository;
    }

    @Override
    public Set<Approvals> getAll()
    {
        Collection<Approvals> approvalsCollection = this.approvalsMap.values();
        Set<Approvals> set = new HashSet<>();
        set.addAll(approvalsCollection);
        return set;
        //return this.approvalsMap;
    }

    @Override
    public Approvals create(Approvals approvals)
    {
        this.approvalsMap.put(approvals.getApprovalNo(), approvals);
        return approvals;
    }

    @Override
    public Approvals read(String s) {
        return this.approvalsMap.get(s);
    }

    @Override
    public Approvals update(Approvals approvals) {
        this.approvalsMap.replace(approvals.getApprovalNo(), approvals);
        return this.approvalsMap.get(approvals.getApprovalNo());
    }

    @Override
    public void delete(String s)
    {
        this.approvalsMap.remove(s);
    }
}
