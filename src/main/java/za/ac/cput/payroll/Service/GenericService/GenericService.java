package za.ac.cput.payroll.Service.GenericService;

import za.ac.cput.payroll.Domain.Employee.Employee;
import za.ac.cput.payroll.Domain.Gender.EmployeeGender;
import za.ac.cput.payroll.Domain.Gender.Gender;
import za.ac.cput.payroll.Factory.Employee.EmployeeFactory;
import za.ac.cput.payroll.Factory.Gender.EmployeeGenderFactory;
import za.ac.cput.payroll.Service.Employee.Impl.EmployeeServiceImpl;
import za.ac.cput.payroll.Service.Gender.EmployeeGenderService;
import za.ac.cput.payroll.Service.Gender.GenderService;
import za.ac.cput.payroll.Service.Gender.Impl.GenderServiceImpl;

public class GenericService {
 /*   public Employee createEmployee(String fName, String lName, String gender)
    {
        Employee employee = EmployeeFactory.getEmployee(fName, lName, gender);

        Gender g = GenderService.getService(gender);

        EmployeeGender eg = EmployeeGenderFactory.employeeGender(employee.getEmpNo(), g.getGenderID());
        EmployeeServiceImpl.getService().create(employee);
        EmployeeGenderService.getEmployeeGenderService().create(eg);



    }
    */
}
