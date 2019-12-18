package za.ac.cput.vehiclemanagementsystem.Service.AdminOperations.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository.AdminOperationsRepository;
//import za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository.Implements.AdminOperationsRepoImplements;
import za.ac.cput.vehiclemanagementsystem.Service.AdminOperations.AdminOperationsService;

import java.util.List;
import java.util.Optional;

@Service

public class AdminOperationsServiceImplements implements AdminOperationsService
{
@Autowired

//@Qualifier("InMemory")
    private static AdminOperationsServiceImplements service = null;

    @Autowired
    private AdminOperationsRepository repository;


    private AdminOperationsServiceImplements()
    {
      //  this.repository = AdminOperationsRepoImplements.getRepository();
    }

    public static AdminOperationsServiceImplements getService()
    {
        if (service == null)
        {
            service = new AdminOperationsServiceImplements();
        }
        return service;
    }

    /*
    @Override
    public List<AdminOperations> findAll() {
        return this.repository.findAll();
    } */

    @Override
    public AdminOperations create(AdminOperations adminOperations) {
     //   return this.repository.create(adminOperations);
        return this.repository.save(adminOperations);
    }

    @Override
    public AdminOperations read(String s) {
        //return this.repository.read(s);
        Optional<AdminOperations> optionalAdminOperations = this.repository.findById(s);
        return optionalAdminOperations.orElse(null);
    }

    @Override
    public AdminOperations update(AdminOperations adminOperations) {
      //  return this.repository.update(adminOperations);
        return this.repository.save(adminOperations);
    }

    @Override
    public void delete(String s)
    {
        this.repository.deleteById(s);
    }

    @Override
    public AdminOperations retrieveByDesc(String operationDesc)
    {
        List<AdminOperations> operations = getAll();
        for (AdminOperations adminOperations: operations)
        {
            if(adminOperations.getOperation().equalsIgnoreCase(operationDesc))
                return null;
        }
        return null;
    }

    public List<AdminOperations> getAll()
    {
        return this.repository.findAll();
    }

}
