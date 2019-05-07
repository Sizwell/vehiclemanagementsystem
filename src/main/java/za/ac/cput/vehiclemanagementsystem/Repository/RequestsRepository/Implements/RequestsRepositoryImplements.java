package za.ac.cput.vehiclemanagementsystem.Repository.RequestsRepository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Requests.Requests;
import za.ac.cput.vehiclemanagementsystem.Repository.RequestsRepository.RequestsRepository;

import java.util.ArrayList;
import java.util.List;

public class RequestsRepositoryImplements implements RequestsRepository {

    private static RequestsRepositoryImplements requestRepository = null;
    private List<Requests> requestsList;

    private RequestsRepositoryImplements()
    {
        this.requestsList = new ArrayList<>();
    }

    public static RequestsRepository getRequests()
    {
        if(requestRepository == null)
        {
            requestRepository = new RequestsRepositoryImplements();
        }
        return requestRepository;
    }

    @Override
    public List<Requests> getAll()
    {
        return this.requestsList;
    }

    @Override
    public Requests create(Requests requests)
    {
        this.requestsList.add(requests);
        return requests;
    }

    @Override
    public Requests read(String s) {
        return null;
    }

    @Override
    public Requests update(Requests requests) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
