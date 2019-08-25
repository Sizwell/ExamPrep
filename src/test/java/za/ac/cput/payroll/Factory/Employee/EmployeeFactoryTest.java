package za.ac.cput.payroll.Factory.Employee;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.payroll.Domain.Employee.Employee;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    Employee employee;

    @Before
    public void setUp() throws Exception
    {
        this.employee = EmployeeFactory.getEmployee("213207834", "Sizwe", "Ncikana");
    }

    @Test
    public void getEmployee()
    {
        Assert.assertEquals(employee.getEmpNo(), "213207834", "213207834");
        System.out.println(employee.getEmpNo() + employee.getEmpName() + employee.getEmpSurname());
    }
}