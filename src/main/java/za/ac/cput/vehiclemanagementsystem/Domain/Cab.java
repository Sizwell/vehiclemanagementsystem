package za.ac.cput.vehiclemanagementsystem.Domain;

public class Cab {

    private String vinNo;
    private String vehicleType;
    private String driverName;

    public Cab()
    {

    }

    public Cab(Builder builder)
    {
        this.vinNo = builder.vinNo;
        this.vehicleType = builder.vehicleType;
        this.driverName = builder.driverName;
    }


    public static class Builder
    {
        private String vinNo;
        private String vehicleType;
        private String driverName;

        public Builder vinNumber(String vin)
        {
            this.vinNo = vin;
            return this;
        }

        public Builder vehicleType(String type)
        {
            this.vehicleType = type;
            return this;
        }

        public Builder driverName(String name)
        {
            this.driverName = name;
            return this;
        }

        public Cab build()
        {
            return new Cab(this);
        }
    }

    public String getVinNo()
    {
        return vinNo;
    }

    public String getVehicleType()
    {
        return vehicleType;
    }

    public String getDriverName()
    {
        return driverName;
    }

    @Override
    public String toString() {
        return "------ Cab ------\n" +
                "\nVin No : '" + vinNo + '\'' +
                "\nVehicle Type : '" + vehicleType + '\'' +
                "\nDriver Name : '" + driverName + '\'';
    }
}
