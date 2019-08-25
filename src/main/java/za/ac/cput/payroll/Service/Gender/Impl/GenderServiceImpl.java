package za.ac.cput.payroll.Service.Gender.Impl;

import za.ac.cput.payroll.Domain.Gender.Gender;
import za.ac.cput.payroll.Repository.Gender.GenderRepository;
import za.ac.cput.payroll.Repository.Gender.Impl.GenderRepositoryImpl;
import za.ac.cput.payroll.Service.Gender.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {

    private static GenderServiceImpl service = null;
    private GenderRepository repository;

    private GenderServiceImpl()
    {
        this.repository = GenderRepositoryImpl.getRepository();
    }

    public static GenderServiceImpl getService()
    {
        if(service == null)
        {
            service = new GenderServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Gender> getGenderService()
    {
        return repository.getAll();
    }

    @Override
    public Gender create(Gender gender)
    {
        return this.repository.create(gender);
    }

    @Override
    public Gender read(String r)
    {
        return this.repository.read(r);
    }

    @Override
    public Gender update(Gender gender)
    {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String d)
    {
        this.repository.delete(d);
    }
}
