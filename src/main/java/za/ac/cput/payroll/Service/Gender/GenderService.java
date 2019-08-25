package za.ac.cput.payroll.Service.Gender;

import za.ac.cput.payroll.Domain.Gender.Gender;
import za.ac.cput.payroll.Service.IService;

import java.util.Set;

public interface GenderService extends IService <Gender, String>
{
    Set <Gender> getGenderService();
}
