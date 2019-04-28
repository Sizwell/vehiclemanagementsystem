package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.Deductions;

import java.util.Set;

public interface DeductionsRepository extends ControlRepository <Deductions, String>
{
    Set <Deductions> getAll();
}
