package za.ac.cput.payroll.Repository.Employee.Impl;

import za.ac.cput.payroll.Domain.Employee.Employee;
import za.ac.cput.payroll.Repository.Employee.EmployeeRepository;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    public static EmployeeRepositoryImpl repository = null;
    Map<String, Employee> employeeMap;

    public EmployeeRepositoryImpl ()
    {
        this.employeeMap = new HashMap<>();
    }

    public static EmployeeRepository getEmployeeRepository()
    {
        if(repository == null)
        {
            repository = new EmployeeRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Set<Employee> getAll()
    {
        Collection<Employee> employeeCollection = this.employeeMap.values();
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.addAll(employeeCollection);

        return employeeSet;
    }

    @Override
    public Employee create(Employee employee)
    {
        if(read(employee.getEmpNo()) == null)
        {
            employeeMap.put(employee.getEmpNo(), employee);
        }
        return employeeMap.get(employee.getEmpNo());
    }

    @Override
    public Employee read(String s)
    {
        return employeeMap.get(s);
    }

    @Override
    public Employee update(Employee employee)
    {
        if(employeeMap.get(employee.getEmpNo()) != null)
        {
            employeeMap.remove(employee);
            employeeMap.put(employee.getEmpNo(), employee);
        }
        return this.employeeMap.get(employee.getEmpNo());
    }

    @Override
    public void delete(String s)
    {
        this.employeeMap.remove(s);
    }
}
