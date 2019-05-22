package za.ac.cput.vehiclemanagementsystem.Service.LicenseDiskService;

import za.ac.cput.vehiclemanagementsystem.Domain.LicenseDisk.LicenseDisk;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.Set;

public interface LicenseDiskService extends ControlService<LicenseDisk, String>
{
    Set<LicenseDisk> getAll();
}
