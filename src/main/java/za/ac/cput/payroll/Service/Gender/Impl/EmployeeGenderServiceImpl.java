package za.ac.cput.payroll.Service.Gender.Impl;

import za.ac.cput.payroll.Domain.Gender.EmployeeGender;
import za.ac.cput.payroll.Repository.Gender.EmployeeGenderRepository;
import za.ac.cput.payroll.Repository.Gender.Impl.EmployeeGenderRepositoryImpl;
import za.ac.cput.payroll.Service.Gender.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private static EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepository repository;

    public EmployeeGenderServiceImpl()
    {
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
    }

    private static EmployeeGenderServiceImpl getService()
    {
        if(service == null)
        {
            service = new EmployeeGenderServiceImpl();
         }
         return service;
    }


    @Override
    public Set<EmployeeGender> getEmployeeGenderService()
    {
        return repository.getEmployeeGender();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender)
    {
        return this.repository.create(employeeGender);
    }

    @Override
    public EmployeeGender read(String s)
    {
        return repository.read(s);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender)
    {
        return this.repository.update(employeeGender);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }
}
