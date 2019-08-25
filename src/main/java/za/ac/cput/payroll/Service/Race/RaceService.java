package za.ac.cput.payroll.Service.Race;

import za.ac.cput.payroll.Domain.Race.Race;
import za.ac.cput.payroll.Service.IService;

import java.util.Set;

public interface RaceService extends IService <Race, String>
{
    Set <Race> getRaceService();
}
