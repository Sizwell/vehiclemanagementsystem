package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.CheckIn;

public class CheckInFactory {

    public static CheckIn getCheckIn(int eNo, String nme) {
        return new CheckIn.Builder()
                .empNo(eNo)
                .empName(nme)
                .build();
    }
}
