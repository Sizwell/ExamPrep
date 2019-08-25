package za.ac.cput.payroll.Domain.Employee;

public class Employee {

    private String empNo;
    private String empName;
    private String empSurname;

    private Employee()
    {

    }

    public Employee(Builder builder)
    {
        this.empNo = builder.empNum;
        this.empName = builder.empFName;
        this.empSurname = builder.empLName;
    }

    public static class Builder
    {
        private String empNum;
        private String empFName;
        private String empLName;

        public Builder employeeNumber(String id)
        {
            this.empNum = id;
            return this;
        }

        public Builder employeeName(String name)
        {
            this.empFName = name;
            return this;
        }

        public Builder employeeSurname(String surname)
        {
            this.empLName = surname;
            return this;
        }

        public Builder copyAll(Employee employee)
        {
            this.empNum = employee.empNo;
            this.empFName = employee.empName;
            this.empLName = employee.empSurname;

            return this;
        }

        public Employee build()
        {
            return new Employee(this);
        }

    }

    //Get Methods

    public String getEmpNo()
    {
        return this.empNo;
    }

    public String getEmpName()
    {
        return this.empName;
    }

    public String getEmpSurname()
    {
        return this.empSurname;
    }

    public String toString()
    {
        String str;

        str = "EmployeeFactory #: " + getEmpNo() + " Name: " + getEmpName() + " Surname: " + getEmpSurname();
        return str;
    }

}
