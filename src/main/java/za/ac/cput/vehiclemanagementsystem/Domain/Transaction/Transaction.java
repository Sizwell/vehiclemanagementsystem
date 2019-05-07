package za.ac.cput.vehiclemanagementsystem.Domain.Transaction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Transaction {

    private boolean checkedIn;
    private Date transactionDate;

    public Transaction() {

    }

    public Transaction(Builder builder) {
        this.checkedIn = builder.checkedIn;
        this.transactionDate = builder.transactionDate;
    }

    public static class Builder {
        private boolean checkedIn;
        private Date transactionDate;

        public Builder checkedIn(boolean no) {
            this.checkedIn = no;
            return this;
        }

        public Builder checkInDate(Date date) {
            this.transactionDate = date;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }

    }

    public boolean getCheckedIn() {
        return checkedIn;
    }

    public Date getCheckInDate() {
       /* Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        String strDate = dateFormat.format(date);

        String noCheckIn = "Did not Checkin on this day";

        if(checkedIn = false){
            transactionDate.equals(noCheckIn);
        }
        else {
            checkedIn = true;
        }*/
        return transactionDate;

    }

    @Override
    public String toString() {
        return "------ Employee Check-in------" +
                "\nChecked in : " + getCheckedIn() +
                "\nCheck-in Date : '" + getCheckInDate() + '\'';
    }
}
