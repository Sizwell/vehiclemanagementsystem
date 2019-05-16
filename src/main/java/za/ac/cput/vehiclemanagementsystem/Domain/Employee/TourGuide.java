package za.ac.cput.vehiclemanagementsystem.Domain.Employee;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class TourGuide {

    private int empNumb;
    private String empName;
    private String empSurname;

    public TourGuide() {

    }

    public TourGuide(Builder builder) {
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


        public TourGuide build() {
            return new TourGuide(this);
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
        return "------ Tour Guide ------\n" +
                "Emp Number : " + getEmpNumb() +
                "\nEmp Name : '" + getEmpName() + '\'' +
                "\nEmp Surname : '" + getEmpSurname() + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TourGuide)) return false;
        TourGuide tourGuide = (TourGuide) o;
        return empNumb == tourGuide.empNumb &&
                empName.equals(tourGuide.empName) &&
                empSurname.equals(tourGuide.empSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumb, empName, empSurname);
    }
}
