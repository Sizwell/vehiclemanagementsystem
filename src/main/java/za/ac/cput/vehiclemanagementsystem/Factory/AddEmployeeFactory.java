package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.AddEmployee;

public class AddEmployeeFactory {

    public static AddEmployee getEmployee(int eNo, String nme)
    {
        return new AddEmployee.Builder()
                .empNo(eNo)
                .empName(nme)
                .build();
    }
}
