package za.ac.cput.payroll.Service.Race.Impl;

import za.ac.cput.payroll.Domain.Race.Race;
import za.ac.cput.payroll.Repository.Race.RaceImpl.RaceRepositoryImpl;
import za.ac.cput.payroll.Repository.Race.RaceRepository;
import za.ac.cput.payroll.Service.Race.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService {

    private static RaceServiceImpl service = null;
    private RaceRepository repository;

    private RaceServiceImpl()
    {
        this.repository = RaceRepositoryImpl.getRepository();
    }

    @Override
    public Set<Race> getRaceService()
    {
        return this.repository.getAll();
    }

    @Override
    public Race create(Race race)
    {
        return this.repository.create(race);
    }

    @Override
    public Race read(String r)
    {
        return this.read(r);
    }

    @Override
    public Race update(Race race)
    {
        return this.repository.update(race);
    }

    @Override
    public void delete(String d)
    {
        this.repository.delete(d);
    }
}
