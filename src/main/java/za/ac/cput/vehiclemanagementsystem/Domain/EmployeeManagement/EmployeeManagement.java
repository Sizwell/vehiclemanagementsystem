package za.ac.cput.vehiclemanagementsystem.Domain.EmployeeManagement;

public class EmployeeManagement {

    private int empID;
    private String empName;
    private String empTasks;

    public EmployeeManagement() {

    }

    public EmployeeManagement(Builder builder) {
        this.empID = builder.empID;
        this.empName = builder.empName;
        this.empTasks = builder.empTasks;
    }

    public static class Builder {
        private int empID;
        private String empName;
        private String empTasks;

        public Builder empID(int id) {
            this.empID = id;
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

        public EmployeeManagement build() {
            return new EmployeeManagement(this);
        }

    }

    public int getEmpID() {
        return empID;
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
                "emp ID : " + empID +
                "\nEmp Name : '" + empName + '\'' +
                "\nEmp Tasks : '" + empTasks + '\'';
    }
}
