package za.ac.cput.vehiclemanagementsystem.Service.DeductionsService;

import za.ac.cput.vehiclemanagementsystem.Domain.Deductions.Deductions;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.Map;

public interface DeductionsServices extends ControlService<String, Deductions>
{
    Map<String, Deductions> getAllDeductions();
}
