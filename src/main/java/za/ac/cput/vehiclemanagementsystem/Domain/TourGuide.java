package za.ac.cput.vehiclemanagementsystem.Domain;

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
                "Emp Number : " + empNumb +
                "\nEmp Name : '" + empName + '\'' +
                "\nEmp Surname : '" + empSurname + '\'';
    }
}
