package za.ac.cput.vehiclemanagementsystem.Repository.LicenseDiskRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.LicenseDisk.LicenseDisk;
import za.ac.cput.vehiclemanagementsystem.Repository.LicenseDiskRepository.LicenseDiskRepository;

import java.util.HashSet;
import java.util.Set;

public class LicenseDiskRepositoryImplements implements LicenseDiskRepository
{

    private static LicenseDiskRepositoryImplements licenseRepository = null;
    private LicenseDiskRepository repository;

    private Set <LicenseDisk> licenseDiskSet;

    private LicenseDiskRepositoryImplements()
    {
        this.licenseDiskSet = new HashSet<>();
    }

    public static LicenseDiskRepository getRepository()
    {
        if(licenseRepository == null)
        {
            licenseRepository = new LicenseDiskRepositoryImplements();
        }
        return licenseRepository;
    }

    @Override
    public Set<LicenseDisk> getAll() {
        return this.licenseDiskSet;
    }

    @Override
    public LicenseDisk create(LicenseDisk licenseDisk)
    {
        this.licenseDiskSet.add(licenseDisk);
        return licenseDisk;
    }

    @Override
    public LicenseDisk read(String s) {
        return this.repository.read(s);
    }

    @Override
    public LicenseDisk update(LicenseDisk licenseDisk) {
        return this.repository.update(licenseDisk);
    }

    @Override
    public void delete(String d)
    {
        this.repository.delete(d);
    }
}
