package za.ac.cput.vehiclemanagementsystem.Repository.ApprovalsRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Approvals.Approvals;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.Map;
import java.util.Set;

public interface ApprovalsRepository extends ControlRepository<Approvals, String>
{
    Set <Approvals> getAll();
}
