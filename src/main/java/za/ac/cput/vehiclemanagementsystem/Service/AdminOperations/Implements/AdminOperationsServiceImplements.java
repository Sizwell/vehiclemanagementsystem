package za.ac.cput.vehiclemanagementsystem.Service.AdminOperations.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository.AdminOperationsRepository;
import za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository.Implements.AdminOperationsRepoImplements;
import za.ac.cput.vehiclemanagementsystem.Service.AdminOperations.AdminOperationsService;

import java.util.List;
@Service
public class AdminOperationsServiceImplements implements AdminOperationsService
{
//@Autowired

//@Qualifier("InMemory")
    private static AdminOperationsServiceImplements service = null;
    private AdminOperationsRepository repository;

    private AdminOperationsServiceImplements()
    {
        this.repository = AdminOperationsRepoImplements.getRepository();
    }

    public static AdminOperationsServiceImplements getService()
    {
        if (service == null)
        {
            service = new AdminOperationsServiceImplements();
        }
        return service;
    }

    @Override
    public List<AdminOperations> findAll() {
        return this.repository.findAll();
    }

    @Override
    public AdminOperations create(AdminOperations adminOperations) {
        return this.repository.create(adminOperations);
    }

    @Override
    public AdminOperations read(String s) {
        return this.repository.read(s);
    }

    @Override
    public AdminOperations update(AdminOperations adminOperations) {
        return this.repository.update(adminOperations);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }
}
