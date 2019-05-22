package za.ac.cput.vehiclemanagementsystem.Repository.TrackerRepository.Implements;

import org.springframework.stereotype.Repository;
import za.ac.cput.vehiclemanagementsystem.Domain.Tracker.Tracker;
import za.ac.cput.vehiclemanagementsystem.Repository.TrackerRepository.TrackerRepository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class TrackerRepoImplements implements TrackerRepository {

    private static TrackerRepoImplements trackerRepository = null;
    private List <Tracker> trackerList;

    public TrackerRepoImplements ()
    {
        this.trackerList = new ArrayList<>();
    }

    public static TrackerRepoImplements getTracker()
    {
        if(trackerRepository == null)
        {
            trackerRepository = new TrackerRepoImplements();
        }
        return trackerRepository;
    }

    private Tracker findTracker(String trackerId)
    {
        return this.trackerList.stream()
                .filter(tracker -> tracker.getTrackerNo().trim().equals(trackerId))
                .findAny()
                .orElse(null);
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
    public Tracker read(String s)
    {
        Tracker tracker = findTracker(s);
        return tracker;
    }

    @Override
    public Tracker update(Tracker tracker)
    {
        Tracker uTracker = findTracker(tracker.getTrackerNo());
        if (uTracker != null)
        {
            this.trackerList.remove(uTracker);
            return create(tracker);
        }
        return null;
    }

    @Override
    public void delete(String s)
    {
        Tracker track = findTracker(s);
        if (track != null)
        {
            this.trackerList.remove(track);
        }
    }


}
