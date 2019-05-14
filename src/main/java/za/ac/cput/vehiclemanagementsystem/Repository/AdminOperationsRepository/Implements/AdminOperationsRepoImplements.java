package za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Admin;
import za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository.AdminOperationsRepository;

import java.util.ArrayList;
import java.util.List;

public class AdminOperationsRepoImplements implements AdminOperationsRepository {

    private static AdminOperationsRepoImplements admin = null;
    private List<AdminOperations> adminList;

    private AdminOperationsRepoImplements() {
        this.adminList = new ArrayList<>();
    }

    public AdminOperations findOperations(String operation)
    {
        return this.adminList.stream().filter(adminOperations -> adminOperations.getOperation()
                .trim().equals(operation))
                .findAny()
                .orElse(null);
   }

    public static AdminOperationsRepoImplements getRepository() {
        if (admin == null) {
            admin = new AdminOperationsRepoImplements();
        }
        return admin;
    }

    @Override
    public List<AdminOperations> findAll() {
        return this.adminList;
    }

    @Override
    public AdminOperations create(AdminOperations adminOperations) {
        this.adminList.add(adminOperations);
        return adminOperations;
    }

    @Override
    public AdminOperations read(String read) {
        AdminOperations adminOperations = findOperations(read);
        return adminOperations;
    }

    @Override
    public AdminOperations update(AdminOperations adminOperations)
    {
        AdminOperations toUpdate = findOperations(adminOperations.getOperationID());
        if(toUpdate != null){
            this.adminList.remove(toUpdate);
            return create(adminOperations);
        }
        return null;
    }

    @Override
    public void delete(String delete)
    {
        AdminOperations toDelete = findOperations(delete);
        if (toDelete != null)
        {
            this.adminList.remove(toDelete);
        }

    }
}
