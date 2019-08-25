package za.ac.cput.payroll.Factory.Employee;

import za.ac.cput.payroll.Domain.Employee.Employee;

public class EmployeeFactory {

  public static Employee getEmployee(String empNo, String name, String surname)
  {
      return new Employee.Builder()
              .employeeNumber(empNo)
              .employeeName(name)
              .employeeSurname(surname)
              .build();

  }
}
