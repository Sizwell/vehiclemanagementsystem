package za.ac.cput.vehiclemanagementsystem.Domain;

public class Deductions {
    private String deductionType;
    private double deductionAmount;

    public Deductions()
    {

    }

    public Deductions(Builder builder)
    {
        this.deductionType = builder.deductionType;
        this.deductionAmount = builder.deductionAmount;
    }

    public static class Builder
    {
        private String deductionType;
        private double deductionAmount;

        public Builder deductType(String deduct)
        {
            this.deductionType = deduct;
            return this;
        }

        public Builder deductAmount(double deductAmount)
        {
            this.deductionAmount = deductAmount;
            return this;
        }

        public Deductions build()
        {
            return new Deductions(this);
        }

    }

    public String getDeductionType()
    {
        return deductionType;
    }

    public double getDeductionAmount()
    {
        return deductionAmount;
    }

    @Override
    public String toString() {
        return "------ Deductions ------\n" +
                "Deduction Type : '" + deductionType + '\'' +
                "\nDeduction Amount = R" + deductionAmount + '\'';
    }
}
