package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.Manager;

public class ManagerFactory {

    public static Manager getManager(int empNo, String name, String surname, String designation)
    {
        return new Manager.Builder()
                .empNumb(empNo)
                .empName(name)
                .empSurname(surname)
                .designation(designation)
                .build();
    }
}
