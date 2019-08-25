package za.ac.cput.payroll.Repository.Employee;

import za.ac.cput.payroll.Domain.Employee.Employee;
import za.ac.cput.payroll.Repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String>
{
    Set<Employee> getAll();
}
