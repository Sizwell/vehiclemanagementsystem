package za.ac.cput.vehiclemanagementsystem.Domain;

public class CheckIn {

    private int eNo;
    private String eName;

    public CheckIn()
    {

    }

    public CheckIn(Builder builder)
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

        public CheckIn build()
        {
           return new CheckIn(this);
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
        return "------ Employee Check-in------" +
                "\nEmployee No : " + eNo +
                "\nEmployee Name : '" + eName + '\'';
    }
}
