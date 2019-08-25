package za.ac.cput.payroll.Repository.Race;

import za.ac.cput.payroll.Domain.Race.Race;
import za.ac.cput.payroll.Repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository <Race, String>
{
    Set <Race> getAll();
}
