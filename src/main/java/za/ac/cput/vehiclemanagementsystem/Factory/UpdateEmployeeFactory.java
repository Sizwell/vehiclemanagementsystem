package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.UpdateEmployee;

public class UpdateEmployeeFactory {

    public static UpdateEmployee getEmployee(int eNo, String nme)
    {
        return new UpdateEmployee.Builder()
                .empNo(eNo)
                .empName(nme)
                .build();
    }

}
