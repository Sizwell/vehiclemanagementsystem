package za.ac.cput.vehiclemanagementsystem.Domain.Employee;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Driver {

    private int driverNo;
    private String empName;
    private String empSurname;

    public Driver() {

    }

    public Driver(Builder builder) {
        this.driverNo = builder.driverNo;
        this.empName = builder.empName;
        this.empSurname = builder.empSurname;

    }

    public static class Builder {
        private int driverNo;
        private String empName;
        private String empSurname;


        public Builder driverNo(int empNo) {
            this.driverNo = empNo;
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


        public Driver build() {
            return new Driver(this);
        }
    }

    public int getEmpNumb() {
        return driverNo;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }


    @Override
    public String toString() {
        return "------ Driver ------\n" +
                "Emp Number : " + driverNo +
                "\nEmp Name : '" + empName + '\'' +
                "\nEmp Surname : '" + empSurname + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver driver = (Driver) o;
        return driverNo == driver.driverNo &&
                empName.equals(driver.empName) &&
                empSurname.equals(driver.empSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driverNo, empName, empSurname);
    }
}
