package za.ac.cput.vehiclemanagementsystem.Factory.EmployeeFactory.EmployeesFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Employee.Driver;

public class DriverFactory {

    public static Driver getDriver(int empNo, String name, String surname) {
        return new Driver.Builder()
                .driverNo(empNo)
                .empName(name)
                .empSurname(surname)
                .build();
    }
}
