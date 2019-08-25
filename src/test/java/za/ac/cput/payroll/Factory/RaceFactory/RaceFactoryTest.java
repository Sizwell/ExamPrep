package za.ac.cput.payroll.Factory.RaceFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.payroll.Domain.Race.Race;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    Race race;

    @Before
    public void setUp() throws Exception
    {
        race = RaceFactory.getEmployeeRace("rce", "African");
    }

    @Test
    public void getEmployeeRace()
    {
        Assert.assertEquals(race.getEmpRace(), "African", "African");
    }

}