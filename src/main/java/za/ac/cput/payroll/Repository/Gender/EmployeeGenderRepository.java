package za.ac.cput.payroll.Repository.Gender;

import za.ac.cput.payroll.Domain.Gender.EmployeeGender;
import za.ac.cput.payroll.Repository.IRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends IRepository <EmployeeGender, String>
{
    Set<EmployeeGender> getEmployeeGender();
}
