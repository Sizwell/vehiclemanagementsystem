package za.ac.cput.vehiclemanagementsystem.Service.LicenseDiskService.Implements;

import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.LicenseDisk.LicenseDisk;
import za.ac.cput.vehiclemanagementsystem.Repository.LicenseDiskRepository.Implements.LicenseDiskRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.LicenseDiskRepository.LicenseDiskRepository;
import za.ac.cput.vehiclemanagementsystem.Service.LicenseDiskService.LicenseDiskService;

import java.util.Set;
@Service
public class LicenseDiskServiceImpl implements LicenseDiskService {

    private static LicenseDiskServiceImpl service = null;
    private LicenseDiskRepository repository;

    private LicenseDiskServiceImpl()
    {
        this.repository = LicenseDiskRepositoryImplements.getRepository();
    }

    public static LicenseDiskServiceImpl getService()
    {
        if (service == null)
        {
            service = new LicenseDiskServiceImpl();
        }
        return service;
    }
    
    @Override
    public Set<LicenseDisk> getAll() {
        return this.repository.getAll();
    }

    @Override
    public LicenseDisk create(LicenseDisk licenseDisk) {
        return this.repository.create(licenseDisk);
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
    public void delete(String s) {
        this.repository.delete(s);
    }
}
