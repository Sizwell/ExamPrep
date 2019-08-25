package za.ac.cput.payroll.Domain.Gender;

import za.ac.cput.payroll.Domain.Employee.Employee;

public class Gender {

    private String genderID;
    private String employeeGender;

    private Gender()
    {

    }

    public Gender(Builder builder)
    {
        this.genderID = builder.id;
        this.employeeGender = builder.gender;
    }

    public static class Builder
    {
        private String id;
        private String gender;

       public Builder empID(String mID)
       {
           this.id = mID;
           return this;
       }

       public Builder empGender(String mGender)
       {
           this.gender = mGender;
           return this;
       }

       public Builder copy(Gender gender)
       {
           this.id = gender.genderID;
           this.gender = gender.employeeGender;

           return this;
       }

       public Gender build()
       {
           return new Gender(this);
       }

    }

    public String getGenderID()
    {
        return this.genderID;
    }

    public String getEmployeeGender()
    {
        return this.employeeGender;
    }

    public String toString()
    {
        return "ID: " + getGenderID() + " Gender: " + getEmployeeGender();
    }

}
