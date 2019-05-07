package za.ac.cput.vehiclemanagementsystem.Domain.Deductions;

public class Deductions {
    private int deductionsNo;
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
        private int deductionNo;
        private String deductionType;
        private double deductionAmount;

        public Builder deductionNo(int deductNo)
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

        public Deductions build() {
            return new Deductions(this);
        }

    }

    public int getDeductionsNo()
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
}
