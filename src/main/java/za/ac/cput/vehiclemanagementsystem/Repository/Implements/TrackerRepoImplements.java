package za.ac.cput.vehiclemanagementsystem.Repository.Implements;

import za.ac.cput.vehiclemanagementsystem.Domain.Tracker;
import za.ac.cput.vehiclemanagementsystem.Repository.TrackerRepository;

import java.util.ArrayList;
import java.util.List;

public class TrackerRepoImplements implements TrackerRepository {

    private static TrackerRepoImplements trackerRepository = null;
    private List <Tracker> trackerList;

    public TrackerRepoImplements ()
    {
        this.trackerList = new ArrayList<>();
    }

    public static TrackerRepository getTracker()
    {
        if(trackerRepository == null)
        {
            trackerRepository = new TrackerRepoImplements();
        }
        return trackerRepository;
    }

    @Override
    public List<Tracker> getAll()
    {
        return this.trackerList;
    }

    @Override
    public Tracker create(Tracker tracker)
    {
        this.trackerList.add(tracker);
        return tracker;
    }

    @Override
    public Tracker read(String s) {
        return null;
    }

    @Override
    public Tracker update(Tracker tracker) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}
