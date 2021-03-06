package za.ac.cput.vehiclemanagementsystem.Factory.EmployeeFactory.EmployeesFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Employee.TourGuide;

public class TourGuideFactory {

    public static TourGuide getTourGuide(int empNo, String name, String surname) {
        return new TourGuide.Builder()
                .empNumb(empNo)
                .empName(name)
                .empSurname(surname)
                .build();
    }
}
