package za.ac.cput.vehiclemanagementsystem.Service.Approvals;

import za.ac.cput.vehiclemanagementsystem.Domain.Approvals.Approvals;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.List;

public interface ApprovalsService extends ControlService <Approvals, String>
{
    List <Approvals> getAll();
}
