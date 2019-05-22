package za.ac.cput.vehiclemanagementsystem.Repository.DeductionsRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.Deductions.Deductions;
import za.ac.cput.vehiclemanagementsystem.Repository.DeductionsRepository.DeductionsRepository;

import java.util.*;

@Repository
public class DeductionsRepositoryImplements implements DeductionsRepository {

    private static DeductionsRepositoryImplements deductionsRepository = null;
    private DeductionsRepository repository;
    private Map<String, Deductions> deductionsMap;

    private DeductionsRepositoryImplements()
    {
        this.deductionsMap = new HashMap<>();
    }

    public static DeductionsRepositoryImplements getDeductions()
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
        Collection<Deductions> deductionsCollection = this.deductionsMap.values();
        Set<Deductions> set = new HashSet<>();
        set.addAll(deductionsCollection);
        return set;
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
