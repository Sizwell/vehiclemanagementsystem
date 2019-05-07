package za.ac.cput.vehiclemanagementsystem.Factory.TransactionFactory;

import za.ac.cput.vehiclemanagementsystem.Domain.Transaction.Transaction;

import java.util.Date;

public class TransactionFactory {

    public static Transaction getCheckIn(boolean success, Date date) {
        return new Transaction.Builder()
                .checkedIn(success)
                .checkInDate(date)
                .build();
    }
}
