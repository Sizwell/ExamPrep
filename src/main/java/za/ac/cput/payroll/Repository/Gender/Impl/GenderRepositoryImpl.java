package za.ac.cput.payroll.Repository.Gender.Impl;

import za.ac.cput.payroll.Domain.Gender.Gender;
import za.ac.cput.payroll.Repository.Gender.GenderRepository;

import java.util.*;

public class GenderRepositoryImpl implements GenderRepository {

    public static GenderRepositoryImpl repository = null;
    Map<String, Gender> genderMap;

    public GenderRepositoryImpl()
    {
        this.genderMap = new HashMap<>();
    }

    public static GenderRepository getRepository()
    {
        if(repository == null)
        {
            repository = new GenderRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Set<Gender> getAll()
    {
        Collection<Gender> genderCollection = this.genderMap.values();
        Set<Gender> genderSet = new HashSet<>();
        genderSet.addAll(genderCollection);

        return genderSet;
    }

    @Override
    public Gender create(Gender gender)
    {
        if(read(gender.getGenderID()) == null)
        {
            genderMap.put(gender.getGenderID(), gender);
        }
        return this.genderMap.get(gender.getGenderID());
    }

    @Override
    public Gender read(String s)
    {
        return this.genderMap.get(s);
    }

    @Override
    public Gender update(Gender gender)
    {
        if(genderMap.get(gender.getGenderID()) != null)
        {
            genderMap.remove(gender);
            genderMap.put(gender.getGenderID(), gender);
        }
        return this.genderMap.get(gender.getGenderID());
    }

    @Override
    public void delete(String s)
    {
        genderMap.remove(s);
    }
}
