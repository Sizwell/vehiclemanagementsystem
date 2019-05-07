package za.ac.cput.vehiclemanagementsystem.Factory.EmployeeManagementFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement.EmployeeManagement;

public class EmployeeManagementFactory {

    public static EmployeeManagement manageEmployee(int no, String name, String task) {
        return new EmployeeManagement.Builder()
                .empID(no)
                .empName(name)
                .empTasks(task)
                .build();
    }
}
