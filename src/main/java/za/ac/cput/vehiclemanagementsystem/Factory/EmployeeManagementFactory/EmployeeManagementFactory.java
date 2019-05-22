package za.ac.cput.vehiclemanagementsystem.Factory.EmployeeManagementFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement.EmployeeManagement;

public class EmployeeManagementFactory {

    public static EmployeeManagement manageEmployee(String no, String name, String task) {
        return new EmployeeManagement.Builder()
                .taskID(no)
                .empName(name)
                .empTasks(task)
                .build();
    }
}
