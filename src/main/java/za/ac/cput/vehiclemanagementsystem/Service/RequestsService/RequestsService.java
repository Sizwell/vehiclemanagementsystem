package za.ac.cput.vehiclemanagementsystem.Service.RequestsService;

import za.ac.cput.vehiclemanagementsystem.Domain.Requests.Requests;
import za.ac.cput.vehiclemanagementsystem.Service.ControlService;

import java.util.List;

public interface RequestsService extends ControlService<Requests, String>
{
    List<Requests> getAll();
}
