package za.ac.cput.vehiclemanagementsystem.Repository;

import java.util.List;

public interface LicenseDiskRepository  extends ControlRepository <LicenseDiskRepository, String>
{
    List <LicenseDiskRepository> getAll();
}
