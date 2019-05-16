package za.ac.cput.vehiclemanagementsystem.Domain.Transaction;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
@EntityScan
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return checkedIn == that.checkedIn &&
                Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkedIn, transactionDate);
    }
}
