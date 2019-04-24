package za.ac.cput.vehiclemanagementsystem.Domain;

import java.util.Date;

public class Requests {

    private String details;
    private Date date;

    public Requests()
    {

    }

    public Requests(Builder builder)
    {
        this.details = builder.details;
        this.date = builder.date;
    }

    public static class Builder
    {
        private String details;
        private Date date;


        public Builder details(String details)
        {
            this.details = details;
            return this;
        }

        public Builder date(Date dte)
        {
            this.date = dte;
            return this;
        }

        public Requests build()
        {
            return new Requests(this);
        }
    }

    public String getDetails()
    {
        return details;
    }

    public Date getDate()
    {
        return date;
    }

    @Override
    public String toString() {
        return "------ Requests ------\n" +
                "\nDetails: '" + details + '\'' +
                "\nDate: " + date ;
    }
}
