package za.ac.cput.payroll.Factory.Gender;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.payroll.Domain.Gender.Gender;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    Gender gender;

    @Before
    public void setUp() throws Exception
    {
        gender = GenderFactory.getEmpGender("EGM", " Male");
    }

    @Test
    public void getEmpGender()
    {
        Assert.assertNotNull(gender.getGenderID());
        System.out.println("Employee gender: " + gender.getGenderID() + gender.getEmployeeGender());
    }
}