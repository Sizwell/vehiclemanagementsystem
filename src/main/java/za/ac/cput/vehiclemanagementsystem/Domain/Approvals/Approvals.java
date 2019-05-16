package za.ac.cput.vehiclemanagementsystem.Domain.Approvals;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
import java.util.Objects;

@EntityScan
public class Approvals {

    private String vinNo;
    private Date date;
    private String details;

    public Approvals() {

    }

    public Approvals(Builder builder) {
        this.vinNo = builder.vinNo;
        this.date = builder.date;
        this.details = builder.details;
    }

    public static class Builder {
        private String vinNo;
        private Date date;
        private String details;

        public Builder vinNo(String vin) {
            this.vinNo = vin;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Builder details(String details) {
            this.details = details;
            return this;
        }

        public Approvals build() {
            return new Approvals(this);
        }
    }

    public String getVinNo() {
        return vinNo;
    }

    public Date getDate() {
        return date;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "------ Approvals ------\n" +
                "VIN No : '" + vinNo + '\'' +
                "\nDate date : " + date +
                "\nDetails : '" + details + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Approvals)) return false;
        Approvals approvals = (Approvals) o;
        return vinNo.equals(approvals.vinNo) &&
                date.equals(approvals.date) &&
                Objects.equals(details, approvals.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vinNo, date, details);
    }
}
