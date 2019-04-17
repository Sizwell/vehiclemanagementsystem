package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Employee;

public class EmployeeFactory {

    public static Employee getEmployee(int eNo, String fName, String lName)
    {
        return new Employee.Builder()
                .empNumb(eNo)
                .empName(fName)
                .empSurname(fName)
                .build();
    }
}
