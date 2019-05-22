package za.ac.cput.vehiclemanagementsystem.Domain.Deductions;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;

@EntityScan
public class Deductions {
    private String deductionsNo;
    private String deductionType;
    private double deductionAmount;

    public Deductions() {

    }

    public Deductions(Builder builder) {
        this.deductionsNo = builder.deductionNo;
        this.deductionType = builder.deductionType;
        this.deductionAmount = builder.deductionAmount;
    }

    public static class Builder {
        private String deductionNo;
        private String deductionType;
        private double deductionAmount;

        public Builder deductionNo(String deductNo)
        {
            this.deductionNo = deductNo;
            return this;
        }

        public Builder deductType(String deduct) {
            this.deductionType = deduct;
            return this;
        }

        public Builder deductAmount(double deductAmount) {
            this.deductionAmount = deductAmount;
            return this;
        }

        public Builder deductionsCopy(Deductions deductions)
        {
            this.deductionNo = deductions.deductionsNo;
            this.deductionAmount = deductions.deductionAmount;

            return this;
        }

        public Deductions build() {
            return new Deductions(this);
        }

    }

    public String getDeductionsNo()
    {
        return deductionsNo;
    }

    public String getDeductionType() {
        return deductionType;
    }

    public double getDeductionAmount() {
        return deductionAmount;
    }

    @Override
    public String toString() {
        return "------ Deductions ------\n" +
                "Deduction No: '" + deductionsNo + '\''+
                "\nDeduction Type : '" + deductionType + '\'' +
                "\nDeduction Amount = R" + deductionAmount + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deductions)) return false;
        Deductions that = (Deductions) o;
        return deductionsNo == that.deductionsNo &&
                Double.compare(that.deductionAmount, deductionAmount) == 0 &&
                Objects.equals(deductionType, that.deductionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deductionsNo, deductionType, deductionAmount);
    }
}
