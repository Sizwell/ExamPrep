package za.ac.cput.payroll.Repository.Gender;

import za.ac.cput.payroll.Domain.Gender.Gender;
import za.ac.cput.payroll.Repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository <Gender, String>
{
    Set<Gender> getAll();
}
