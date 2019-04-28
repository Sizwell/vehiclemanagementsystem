package za.ac.cput.vehiclemanagementsystem.Domain;

public class RemoveEmployee {

    private int eNo;
    private String eName;

    public RemoveEmployee() {

    }

    public RemoveEmployee(Builder builder) {
        this.eNo = builder.eNo;
        this.eName = builder.eName;
    }

    public static class Builder {
        private int eNo;
        private String eName;

        public Builder empNo(int no) {
            this.eNo = no;
            return this;
        }

        public Builder empName(String name) {
            this.eName = name;
            return this;
        }

        public RemoveEmployee build() {
            return new RemoveEmployee(this);
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
        return "------ Remove Employee ------" +
                "\nEmployee No : " + eNo +
                "\nEmployee Name : '" + eName + '\'';
    }
}
