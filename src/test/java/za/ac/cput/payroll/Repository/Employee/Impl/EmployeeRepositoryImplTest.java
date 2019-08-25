package za.ac.cput.payroll.Repository.Employee.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.payroll.Domain.Employee.Employee;
import za.ac.cput.payroll.Factory.Employee.EmployeeFactory;
import za.ac.cput.payroll.Repository.Employee.EmployeeRepository;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRepositoryImplTest {

    EmployeeRepository employeeRepository;
    Employee employee;

    @Before
    public void setUp() throws Exception
    {
        this.employeeRepository = EmployeeRepositoryImpl.getEmployeeRepository();
        this.employee = EmployeeFactory.getEmployee("213207834", "Sizwe", "Ncikana");
    }

    @Test
    public void create()
    {
        Employee employee = this.employeeRepository.create(this.employee);
        System.out.println("On create: " + employee);

        getAll();
        Assert.assertEquals(employee, this.employee);
    }

    @Test
    public void read()
    {
        Employee readEmployee = EmployeeFactory.getEmployee("232208934", "Odwa", "Ncikana");
        System.out.println("Reading employee...");

        employeeRepository.create(employee);

    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    public void getAll()
    {
        Set<Employee> employeeSet = this.employeeRepository.getAll();
        System.out.println("Getting all..." + employeeSet);
    }
}