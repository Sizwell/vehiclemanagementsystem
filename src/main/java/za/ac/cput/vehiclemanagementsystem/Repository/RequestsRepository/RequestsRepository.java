package za.ac.cput.vehiclemanagementsystem.Repository.RequestsRepository;

import za.ac.cput.vehiclemanagementsystem.Domain.Requests.Requests;
import za.ac.cput.vehiclemanagementsystem.Repository.ControlRepository;

import java.util.List;

public interface RequestsRepository extends ControlRepository<Requests, String>
{
    List <Requests> getAll();
}
