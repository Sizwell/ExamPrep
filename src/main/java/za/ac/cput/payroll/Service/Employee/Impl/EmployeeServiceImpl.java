package za.ac.cput.payroll.Service.Employee.Impl;

import za.ac.cput.payroll.Domain.Employee.Employee;
import za.ac.cput.payroll.Repository.Employee.EmployeeRepository;
import za.ac.cput.payroll.Repository.Employee.Impl.EmployeeRepositoryImpl;
import za.ac.cput.payroll.Service.Employee.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl()
    {
        this.repository = EmployeeRepositoryImpl.getEmployeeRepository();
    }

    public static EmployeeServiceImpl getService()
    {
        if(service == null)
        {
            service = new EmployeeServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Employee> getEmployeeService()
    {
        return repository.getAll();
    }

    @Override
    public Employee create(Employee employee)
    {
        return this.repository.create(employee);
    }

    @Override
    public Employee read(String r)
    {
        return this.repository.read(r);
    }

    @Override
    public Employee update(Employee employee)
    {
        return this.repository.update(employee);
    }

    @Override
    public void delete(String d)
    {
        this.repository.delete(d);
    }
}
