package za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class EmployeeManagement {

    private int taskID;
    private String empName;
    private String empTasks;

    public EmployeeManagement() {

    }

    public EmployeeManagement(Builder builder) {
        this.taskID = builder.taskID;
        this.empName = builder.empName;
        this.empTasks = builder.empTasks;
    }

    public static class Builder {
        private int taskID;
        private String empName;
        private String empTasks;

        public Builder taskID(int id) {
            this.taskID = id;
            return this;
        }

        public Builder empName(String name) {
            this.empName = name;
            return this;
        }

        public Builder empTasks(String task) {
            this.empTasks = task;
            return this;
        }

        public Builder copyTask(EmployeeManagement management)
        {
            this.taskID = management.taskID;
            this.empTasks = management.empTasks;
            return this;
        }

        public EmployeeManagement build() {
            return new EmployeeManagement(this);
        }

    }

    public int getTaskID() {
        return taskID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpTasks() {
        return empTasks;
    }

    @Override
    public String toString() {
        return "------ EmployeeManagement ------\n" +
                "Task ID : " + taskID +
                "\nEmp Name : '" + empName + '\'' +
                "\nEmp Tasks : '" + empTasks + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeManagement)) return false;
        EmployeeManagement that = (EmployeeManagement) o;
        return taskID == that.taskID &&
                Objects.equals(empName, that.empName) &&
                Objects.equals(empTasks, that.empTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskID, empName, empTasks);
    }
}
