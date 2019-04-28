package za.ac.cput.vehiclemanagementsystem.Factory;

import za.ac.cput.vehiclemanagementsystem.Domain.CheckOut;

public class CheckOutFactory {

    public static CheckOut getCheckOut(int eNo, String nme) {
        return new CheckOut.Builder()
                .empNo(eNo)
                .empName(nme)
                .build();
    }

}
