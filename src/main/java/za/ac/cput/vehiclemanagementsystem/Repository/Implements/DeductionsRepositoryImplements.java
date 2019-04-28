package za.ac.cput.vehiclemanagementsystem.Repository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Deductions;
import za.ac.cput.vehiclemanagementsystem.Repository.DeductionsRepository;

import java.util.HashSet;
import java.util.Set;

public class DeductionsRepositoryImplements implements DeductionsRepository {

    private static DeductionsRepositoryImplements deductionsRepository = null;
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
        this.deductionsSet.add(deductions);
        return deductions;
    }

    @Override
    public Deductions read(String s) {
        return null;
    }

    @Override
    public Deductions update(Deductions deductions) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
