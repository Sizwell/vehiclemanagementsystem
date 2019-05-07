package za.ac.cput.vehiclemanagementsystem.Repository.LicenseDiskRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.LicenseDisk.LicenseDisk;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.Set;

public interface LicenseDiskRepository  extends ControlRepository<LicenseDisk, String>
{
    Set <LicenseDisk> getAll();
}
