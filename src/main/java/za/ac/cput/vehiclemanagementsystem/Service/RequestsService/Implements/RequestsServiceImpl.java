package za.ac.cput.vehiclemanagementsystem.Service.RequestsService.Implements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.vehiclemanagementsystem.Domain.Requests.Requests;
import za.ac.cput.vehiclemanagementsystem.Repository.RequestsRepository.Implements.RequestsRepositoryImplements;
import za.ac.cput.vehiclemanagementsystem.Repository.RequestsRepository.RequestsRepository;
import za.ac.cput.vehiclemanagementsystem.Service.RequestsService.RequestsService;

import java.util.List;


import java.util.List;
@Service
public class RequestsServiceImpl implements RequestsService {
    @Autowired
    @Qualifier("InMemory")

    private static RequestsServiceImpl service = null;
    private RequestsRepository repository;

    private RequestsServiceImpl()
    {
        this.repository = RequestsRepositoryImplements.getRequests();
    }

    public static RequestsServiceImpl getService()
    {
        if (service == null)
        {
            service = new RequestsServiceImpl();
        }
        return service;
    }

    @Override
    public List<Requests> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Requests create(Requests requests)
    {
        return this.repository.create(requests);
    }

    @Override
    public Requests read(String s)
    {
        return this.repository.read(s);
    }

    @Override
    public Requests update(Requests requests)
    {
        return this.repository.update(requests);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }
}
