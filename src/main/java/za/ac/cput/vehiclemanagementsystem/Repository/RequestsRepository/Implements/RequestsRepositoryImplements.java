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

    private Requests findRequests(String reqNo)
    {
        return this.requestsList.stream()
                .filter(requests -> requests.getReqNo().trim().equals(reqNo))
                .findAny()
                .orElse(null);
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
    public Requests read(String s)
    {
        Requests requests = findRequests(s);
        return requests;
    }

    @Override
    public Requests update(Requests requests)
    {
        Requests toUpdate = findRequests(requests.getReqNo());
        if (toUpdate != null)
        {
            this.requestsList.remove(toUpdate);
        }
        return toUpdate;
    }

    @Override
    public void delete(String s)
    {
        Requests requests = findRequests(s);
        if (requests != null)
        {
            this.requestsList.remove(requests);
        }
    }
}
