package za.ac.cput.payroll.Factory.RaceFactory;

import za.ac.cput.payroll.Domain.Race.Race;

public class RaceFactory {

    public static Race getEmployeeRace(String id, String race)
    {
        return new Race.Builder()
                .raceID(id)
                .empRace(race)
                .builder();
    }
}
