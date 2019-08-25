package za.ac.cput.payroll.Service.Gender;

import za.ac.cput.payroll.Domain.Gender.EmployeeGender;
import za.ac.cput.payroll.Service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, String>
{
    Set <EmployeeGender> getEmployeeGenderService();
}
