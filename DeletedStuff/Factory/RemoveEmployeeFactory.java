package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.RemoveEmployee;

public class RemoveEmployeeFactory {

    public static RemoveEmployee getEmployee(int eNo, String nme) {
        return new RemoveEmployee.Builder()
                .empNo(eNo)
                .empName(nme)
                .build();
    }

}
