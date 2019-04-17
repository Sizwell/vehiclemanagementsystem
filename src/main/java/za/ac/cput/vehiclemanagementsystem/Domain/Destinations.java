package za.ac.cput.vehiclemanagementsystem.Domain;

public class Destinations {

    private int destineID;
    private String destinName;
    private String address;

    public Destinations()
    {

    }

    public Destinations(Builder builder)
    {
        this.destineID = builder.destineID;
        this.destinName = builder.destinName;
        this.address = builder.address;
    }

    public static class Builder
    {
        private int destineID;
        private String destinName;
        private String address;

        public Builder destineId(int destID)
        {
            this.destineID = destID;
            return this;
        }

        public Builder destineName(String dName)
        {
            this.destinName = dName;
            return this;
        }

        public Builder destinAddress(String dAddress)
        {
            this.address = dAddress;
            return this;
        }

        public Destinations build()
        {
            return new Destinations(this);
        }

    }

    public int getDestineID() {
        return destineID;
    }

    public String getDestinName() {
        return destinName;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "------ Destination ------\n" +
                "Destination ID : " + destineID +
                "\nDestination Name : '" + destinName + '\'' +
                "\nAddress : '" + address + '\'';
    }
}

