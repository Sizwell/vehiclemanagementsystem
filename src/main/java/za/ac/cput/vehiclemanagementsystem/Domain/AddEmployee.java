package za.ac.cput.vehiclemanagementsystem.Domain;

public class AddEmployee {

    private int eNo;
    private String eName;

    public AddEmployee()
    {

    }

    public AddEmployee(Builder builder)
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

        public AddEmployee build()
        {
           return new AddEmployee(this);
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
        return "------ Add Employee ------" +
                "\nEmployee No : " + eNo +
                "\nEmployee Name : '" + eName + '\'';
    }
}
