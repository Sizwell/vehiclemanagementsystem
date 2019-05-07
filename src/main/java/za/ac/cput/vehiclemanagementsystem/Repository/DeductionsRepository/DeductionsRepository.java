package za.ac.cput.vehiclemanagementsystem.Repository.DeductionsRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Deductions.Deductions;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.Set;

public interface DeductionsRepository extends ControlRepository<Deductions, String>
{
    Set <Deductions> getAll();
}
