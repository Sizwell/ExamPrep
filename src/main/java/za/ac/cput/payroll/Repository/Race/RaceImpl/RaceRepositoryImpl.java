package za.ac.cput.payroll.Repository.Race.RaceImpl;

import za.ac.cput.payroll.Domain.Race.Race;
import za.ac.cput.payroll.Repository.Race.RaceRepository;

import java.util.*;

public class RaceRepositoryImpl implements RaceRepository {

    private static RaceRepositoryImpl repository = null;
    private Map<String, Race> raceMap;

    private RaceRepositoryImpl()
    {
        raceMap = new HashMap<>();
    }

    public static RaceRepository getRepository()
    {
        if(repository == null)
        {
            repository = new RaceRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Set<Race> getAll()
    {
        Collection <Race> raceCollection = this.raceMap.values();
        Set <Race> raceSet = new HashSet<>();
        raceSet.addAll(raceCollection);

        return raceSet;
    }

    @Override
    public Race create(Race race)
    {
        if(read(race.getRaceID()) == null)
        {
            raceMap.put(race.getRaceID(), race);
        }
        return this.raceMap.get(race.getRaceID());
    }

    @Override
    public Race read(String s)
    {
        return this.raceMap.get(s);
    }

    @Override
    public Race update(Race race)
    {
        if(raceMap.get(race.getRaceID()) != null)
        {
            raceMap.remove(race.getRaceID());
            raceMap.put(race.getRaceID(), race);
        }
        return this.raceMap.get(race.getRaceID());
    }

    @Override
    public void delete(String s)
    {
        this.raceMap.remove(s);
    }
}
