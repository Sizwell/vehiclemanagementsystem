package za.ac.cput.vehiclemanagementsystem.Repository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository;

import java.util.ArrayList;
import java.util.List;

public class AdminOperationsRepoImplements implements AdminOperationsRepository {

    private static AdminOperationsRepoImplements admin = null;
    private List<AdminOperations> adminList;

    private AdminOperationsRepoImplements()
    {
        this.adminList = new ArrayList<>();
    }

    public static AdminOperationsRepository getRepository()
    {
        if (admin == null){
            admin = new AdminOperationsRepoImplements();
        }
        return admin;
    }

    @Override
    public List<AdminOperations> findAll()
    {
        return this.adminList;
    }

    @Override
    public AdminOperations create(AdminOperations adminOperations)
    {
        this.adminList.add(adminOperations);
        return adminOperations;
    }

    @Override
    public AdminOperations read(String read)
    {
        return admin.read(read);
    }

    @Override
    public AdminOperations update(AdminOperations adminOperations)
    {
        admin.update(adminOperations);
        return adminOperations;
    }

    @Override
    public void delete(String delete)
    {
        admin.delete(delete);
    }
}
