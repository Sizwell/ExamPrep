package za.ac.cput.payroll.Repository.Gender.Impl;

import za.ac.cput.payroll.Domain.Gender.EmployeeGender;
import za.ac.cput.payroll.Repository.Gender.EmployeeGenderRepository;

import java.util.*;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository{

    private static EmployeeGenderRepositoryImpl repository = null;
    private Map<String, EmployeeGender> empGenderMap;

    public EmployeeGenderRepositoryImpl()
    {
        this.empGenderMap = new HashMap<>();
    }

    public static EmployeeGenderRepository getRepository()
    {
        if (repository == null)
        {
            repository = new EmployeeGenderRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Set<EmployeeGender> getEmployeeGender()
    {
        Collection <EmployeeGender> employeeGenderCollection = this.empGenderMap.values();
        Set<EmployeeGender> employeeGenderSet = new HashSet<>();
        employeeGenderSet.addAll(employeeGenderCollection);

        return employeeGenderSet;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender)
    {
        if(read(employeeGender.getEmployeeID()) == null)
        {
            empGenderMap.put(employeeGender.getEmployeeID(), employeeGender);
        }
        return empGenderMap.get(employeeGender.getEmployeeID());
    }

    @Override
    public EmployeeGender read(String s)
    {
        return empGenderMap.get(s);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender)
    {
        if(empGenderMap.get(employeeGender.getEmployeeID()) != null)
        {
            empGenderMap.remove(employeeGender.getEmployeeID());
            empGenderMap.put(employeeGender.getEmployeeID(), employeeGender);
        }
        return empGenderMap.get(employeeGender.getEmployeeID());
    }

    @Override
    public void delete(String s)
    {
        empGenderMap.remove(s);
    }
}
