package za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement;

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
}
