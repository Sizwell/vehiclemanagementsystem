package za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.AdminOperations.AdminOperations;
import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Admin;
import za.ac.cput.vehiclemanagementsystem.Repository.AdminOperationsRepository.AdminOperationsRepository;

import java.util.ArrayList;
import java.util.List;
/*
@Repository
public class AdminOperationsRepoImplements implements AdminOperationsRepository {

    private static AdminOperationsRepoImplements repository = null;
    private List<AdminOperations> repositoryList;


    private AdminOperations findOperations(String operationNo)
    {
        return this.repositoryList.stream().filter(repositoryOperations -> repositoryOperations.getOperation()
                .trim().equals(operationNo))
                .findAny()
                .orElse(null);
    }

    private AdminOperationsRepoImplements() {
        this.repositoryList = new ArrayList<>();
    }

    public static AdminOperationsRepoImplements getRepository() {
        if (repository == null) {
            repository = new AdminOperationsRepoImplements();
        }
        return repository;
    }

    @Override
    public List<AdminOperations> findAll() {
        return null;
    }


    @Override
    public AdminOperations create(AdminOperations adminOperations) {
        return null;
    }

    @Override
    public AdminOperations read(String s) {
        return null;
    }

    @Override
    public AdminOperations update(AdminOperations adminOperations) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

} */
