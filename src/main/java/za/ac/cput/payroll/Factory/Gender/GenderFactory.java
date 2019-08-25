package za.ac.cput.payroll.Factory.Gender;

import za.ac.cput.payroll.Domain.Gender.Gender;

public class GenderFactory {

    public static Gender getEmpGender(String id, String gender)
    {
        return new Gender.Builder()
                .empID(id)
                .empGender(gender)
                .build();
    }

}
