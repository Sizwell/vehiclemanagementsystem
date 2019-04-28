package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.Approvals;

import java.util.Set;

public interface ApprovalsRepository extends ControlRepository<Approvals, String>
{
    Set<Approvals> getAll();
}
