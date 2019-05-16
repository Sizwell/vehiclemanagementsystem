package za.ac.cput.vehiclemanagementsystem.Domain.Employee;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan

public class Admin {

    private int empNumb;
    private String empName;
    private String empSurname;


    public Admin() {

    }

    public Admin(Builder builder) {
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


        public Admin build() {
            return new Admin(this);
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
        return "------ Manager ------\n" +
                "Emp Number : " + empNumb +
                "\nEmp Name : '" + empName + '\'' +
                "\nEmp Surname : '" + empSurname + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;
        Admin admin = (Admin) o;
        return empNumb == admin.empNumb &&
                empName.equals(admin.empName) &&
                empSurname.equals(admin.empSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumb, empName, empSurname);
    }
}
