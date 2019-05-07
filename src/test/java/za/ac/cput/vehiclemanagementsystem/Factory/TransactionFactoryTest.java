package za.ac.cput.vehiclemanagementsystem.Factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.vehiclemanagementsystem.Domain.Transaction.Transaction;
import za.ac.cput.vehiclemanagementsystem.Factory.TransactionFactory.TransactionFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TransactionFactoryTest {

    private Transaction transactionFactory;
    private Transaction transactionFact;

    Date date = Calendar.getInstance().getTime();
    DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss");
    boolean transactionSuccess = true;


    @Before
    public void setUp() throws Exception {
        transactionFactory = TransactionFactory.getCheckIn(true, date);
        transactionFact = TransactionFactory.getCheckIn(false, date);
    }

    @Test
    public void getCheckIn() {
        Assert.assertNotNull(transactionFactory);
        System.out.println(date);
    }

    @Test
    public void validadeCheckIn()
    {
        if(transactionFactory.getCheckedIn()== true)
        {
            System.out.println(transactionFactory.toString());
        }
        if(transactionFactory.getCheckedIn() == false)
        {
            System.out.println("Did not Check-in on: \n" + transactionFactory.getCheckInDate());
        }
      Assert.assertNotSame(transactionFactory, transactionFact);
    }

}