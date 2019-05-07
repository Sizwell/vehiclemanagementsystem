package za.ac.cput.vehiclemanagementsystem.Domain.Employee;

public class Employee {

    private int empNumb;
    private String empName;
    private String empSurname;

    public Employee() {

    }

    public Employee(Builder builder) {
        this.empNumb = builder.empNumb;
        this.empName = builder.empName;
        this.empSurname = builder.empSurname;
    }

    public static class Builder {
        private int empNumb;
        private String empName;
        private String empSurname;

        public Builder empNumb(int empNo) {
            this.empNumb = empNo;
            return this;
        }

        public Builder empName(String empNme) {
            this.empName = empNme;
            return this;
        }

        public Builder empSurname(String empSurname) {
            this.empSurname = empSurname;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }

    public int getEmpNumb() {
        return empNumb;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    @Override
    public String toString() {
        return "------ Employee ------\n" +
                "Emp Number : " + empNumb +
                "\nEmp Name : '" + empName + '\'' +
                "\nEmp Surname : '" + empSurname + '\'';
    }
}
