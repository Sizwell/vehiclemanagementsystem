package za.ac.cput.vehiclemanagementsystem.Repository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Approvals;
import za.ac.cput.vehiclemanagementsystem.Repository.ApprovalsRepository;

import java.util.HashSet;
import java.util.Set;

public class ApprovalsRepositoryImplements implements ApprovalsRepository {

    private static ApprovalsRepositoryImplements approvalsRepository = null;
    private Set<Approvals> approvalsSet;

    private ApprovalsRepositoryImplements()
    {
        this.approvalsSet = new HashSet<>();
    }

    public static ApprovalsRepository getApprovals()
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
        return this.approvalsSet;
    }

    @Override
    public Approvals create(Approvals approvals)
    {
        this.approvalsSet.add(approvals);
        return approvals;
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
