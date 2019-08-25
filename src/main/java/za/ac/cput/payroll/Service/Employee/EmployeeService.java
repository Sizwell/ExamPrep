package za.ac.cput.payroll.Service.Employee;

import za.ac.cput.payroll.Domain.Employee.Employee;
import za.ac.cput.payroll.Service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String>
{
    Set<Employee> getEmployeeService();
}
