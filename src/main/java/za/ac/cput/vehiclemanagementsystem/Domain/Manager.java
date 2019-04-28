package za.ac.cput.vehiclemanagementsystem.Domain;

public class Manager {

    private int empNumb;
    private String empName;
    private String empSurname;
    private String designation;

    public Manager() {

    }

    public Manager(Builder builder) {
        this.empNumb = builder.empNumb;
        this.empName = builder.empName;
        this.empSurname = builder.empSurname;
        this.designation = builder.designation;
    }

    public static class Builder {
        private int empNumb;
        private String empName;
        private String empSurname;
        private String designation;

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

        public Builder designation(String designation) {
            this.designation = designation;
            return this;
        }

        public Manager build() {
            return new Manager(this);
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

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "------ Manager ------\n" +
                "Emp Number : " + empNumb +
                "\nEmp Name : '" + empName + '\'' +
                "\nEmp Surname : '" + empSurname + '\'' +
                "\nDesignation : '" + designation + '\'';
    }
}
