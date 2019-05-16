package za.ac.cput.vehiclemanagementsystem.Domain.Requests;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
import java.util.Objects;
@EntityScan
public class Requests {

    private String reqNo;
    private String details;
    private Date date;

    public Requests() {

    }

    public Requests(Builder builder) {
        this.reqNo = builder.reqNo;
        this.details = builder.details;
        this.date = builder.date;
    }

    public static class Builder {
        private String reqNo;
        private String details;
        private Date date;

        public Builder reguestNo(String reqNo)
        {
            this.reqNo = reqNo;
            return this;
        }

        public Builder details(String details) {
            this.details = details;
            return this;
        }

        public Builder date(Date dte) {
            this.date = dte;
            return this;
        }

        public Builder copyRequests(Requests requests)
        {
            this.reqNo = requests.reqNo;
            this.details = requests.details;
            this.date = requests.date;

            return this;
        }

        public Requests build() {
            return new Requests(this);
        }
    }

    public String getReqNo()
    {
        return reqNo;
    }

    public String getDetails() {
        return details;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "------ Requests ------\n" +
                "Request No: '"+ getReqNo() + '\'' +
                "\nDetails: '" + getDetails() + '\'' +
                "\nDate: " + getDate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Requests)) return false;
        Requests requests = (Requests) o;
        return reqNo.equals(requests.reqNo) &&
                details.equals(requests.details) &&
                date.equals(requests.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reqNo, details, date);
    }


}
