package za.ac.cput.vehiclemanagementsystem.Domain;

public class CheckOut {

    private int eNo;
    private String eName;

    public CheckOut()
    {

    }

    public CheckOut(Builder builder)
    {
        this.eNo = builder.eNo;
        this.eName = builder.eName;
    }

    public static class Builder
    {
        private int eNo;
        private String eName;

        public Builder empNo(int no)
        {
            this.eNo = no;
            return this;
        }

        public Builder empName(String name)
        {
            this.eName = name;
            return this;
        }

        public CheckOut build()
        {
            return new CheckOut(this);
        }

    }

    public int geteNo() {
        return eNo;
    }

    public String geteName() {
        return eName;
    }

    @Override
    public String toString() {
        return "------ Employee Check-out------" +
                "\nEmployee No : " + eNo +
                "\nEmployee Name : '" + eName + '\'';
    }
}
