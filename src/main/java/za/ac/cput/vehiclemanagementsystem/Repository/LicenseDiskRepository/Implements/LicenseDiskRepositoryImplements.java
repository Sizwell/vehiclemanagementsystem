package za.ac.cput.vehiclemanagementsystem.Repository.LicenseDiskRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.LicenseDisk.LicenseDisk;
import za.ac.cput.vehiclemanagementsystem.Repository.LicenseDiskRepository.LicenseDiskRepository;

import java.util.*;

@Repository
public class LicenseDiskRepositoryImplements implements LicenseDiskRepository
{

    private static LicenseDiskRepositoryImplements licenseRepository = null;
   // private LicenseDiskRepository repository;

    private Map<String, LicenseDisk> licenseDiskSet;

    private LicenseDiskRepositoryImplements()
    {
        this.licenseDiskSet = new HashMap<>();
    }

    public static LicenseDiskRepositoryImplements getRepository()
    {
        if(licenseRepository == null)
        {
            licenseRepository = new LicenseDiskRepositoryImplements();
        }
        return licenseRepository;
    }

    @Override
    public Set<LicenseDisk> getAll()
    {
        Collection<LicenseDisk> licenseDiskCollection = this.licenseDiskSet.values();
        Set<LicenseDisk> licenseDisks = new HashSet<>();
        licenseDisks.addAll(licenseDiskCollection);
        return licenseDisks;
    }

    @Override
    public LicenseDisk create(LicenseDisk licenseDisk)
    {
        this.licenseDiskSet.put(licenseDisk.getRegNumber(), licenseDisk);
        return licenseDisk;
    }

    @Override
    public LicenseDisk read(String s) {
        return this.licenseDiskSet.get(s);
    }

    @Override
    public LicenseDisk update(LicenseDisk licenseDisk) {
        this.licenseDiskSet.replace(licenseDisk.getRegNumber(), licenseDisk);
        return this.licenseDiskSet.get(licenseDisk.getRegNumber());
    }

    @Override
    public void delete(String d)
    {
        this.licenseDiskSet.remove(d);
    }
}
