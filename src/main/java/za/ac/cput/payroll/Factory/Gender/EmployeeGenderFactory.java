package za.ac.cput.payroll.Factory.Gender;


import za.ac.cput.payroll.Domain.Employee.Employee;
import za.ac.cput.payroll.Domain.Gender.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender employeeGender(String empID, String genderID)
    {
        return new EmployeeGender.Builder()
                .empGender(genderID)
                .empID(empID)
                .builder();
    }
}
