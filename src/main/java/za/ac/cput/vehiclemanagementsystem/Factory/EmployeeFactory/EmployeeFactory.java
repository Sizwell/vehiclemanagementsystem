package za.ac.cput.vehiclemanagementsystem.Factory.EmployeeFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Employee;

public class EmployeeFactory {

    public static Employee getEmployee(int eNo, String fName, String lName) {
        return new Employee.Builder()
                .empNumb(eNo)
                .empName(fName)
                .empSurname(fName)
                .build();
    }
}
