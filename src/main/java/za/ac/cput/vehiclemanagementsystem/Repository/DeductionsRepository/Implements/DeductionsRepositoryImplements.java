package za.ac.cput.vehiclemanagementsystem.Repository.DeductionsRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Deductions.Deductions;
import za.ac.cput.vehiclemanagementsystem.Repository.DeductionsRepository.DeductionsRepository;

import java.util.HashSet;
import java.util.Set;

public class DeductionsRepositoryImplements implements DeductionsRepository {

    private static DeductionsRepositoryImplements deductionsRepository = null;
    private DeductionsRepository repository;
    private Set<Deductions> deductionsSet;

    private DeductionsRepositoryImplements()
    {
        this.deductionsSet = new HashSet<>();
    }

    public static DeductionsRepository getDeductions()
    {
        if(deductionsRepository == null)
        {
            deductionsRepository = new DeductionsRepositoryImplements();
        }
        return deductionsRepository;
    }

    @Override
    public Set<Deductions> getAll()
    {
        return this.deductionsSet;
    }

    @Override
    public Deductions create(Deductions deductions)
    {
        this.repository.create(deductions);
        return deductions;
    }

    @Override
    public Deductions read(String r) {
        return this.repository.read(r);
    }

    @Override
    public Deductions update(Deductions deductions) {
        return this.repository.update(deductions);
    }

    @Override
    public void delete(String d)
    {
        this.repository.delete(d);
    }
}
