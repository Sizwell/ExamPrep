package za.ac.cput.payroll.Domain.Gender;

import za.ac.cput.payroll.Domain.Employee.Employee;

public class EmployeeGender {
    private String employeeID;
    private String genderID;

    private EmployeeGender()
    {

    }

    private EmployeeGender(Builder builder)
    {
        this.employeeID = builder.employeeID;
        this.genderID = builder.genderID;
    }

    public static class Builder
    {
        private String employeeID;
        private String genderID;

        public Builder empID(String empId)
        {
            this.employeeID = empId;
            return this;
        }

        public Builder empGender(String empGender)
        {
            this.genderID = empGender;
            return this;
        }

        public Builder copy(EmployeeGender employeeGender)
        {
            this.employeeID = employeeGender.employeeID;
            this.genderID = employeeGender.genderID;

            return this;
        }

        public EmployeeGender builder()
        {
            return new EmployeeGender(this);
        }
    }

    public String getEmployeeID()
    {
        return employeeID;
    }

    public String getGenderID()
    {
        return genderID;
    }

    public String toString()
    {
        return "Employee ID: " + getEmployeeID() + "Gender ID: " + getGenderID();
    }


}
