package za.ac.cput.vehiclemanagementsystem.Repository;

import za.ac.cput.vehiclemanagementsystem.Domain.Requests;

import java.util.List;

public interface RequestsRepository extends ControlRepository<Requests, String>
{
    List <Requests> getAll();
}
