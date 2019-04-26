package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Admin;

public class AdminFactory {

    public static Admin getAdmin(int empNo, String name, String surname)
    {
        return new Admin.Builder()
                .empNumb(empNo)
                .empName(name)
                .empSurname(surname)
                .build();
    }
}
