package za.ac.cput.vehiclemanagementsystem.Domain;

public class RemoveVehicle {

    private String vinNo;
    private String model;

    public RemoveVehicle()
    {

    }

    public RemoveVehicle(Builder builder)
    {
        this.vinNo = builder.vinNo;
        this.model = builder.model;
    }


    public static class Builder
    {
        private String vinNo;
        private String model;

        public Builder vinNo(String vin)
        {
            this.vinNo = vin;
            return this;
        }

        public Builder model(String model)
        {
            this.model = model;
            return this;
        }

        public RemoveVehicle build()
        {
            return new RemoveVehicle(this);
        }
    }

    public String getVinNo()
    {
        return vinNo;
    }

    public String getModel()
    {
        return model;
    }

    @Override
    public String toString() {
        return "------ Remove Vehicle ------\n" +
                "VIN No : " + vinNo +
                "\nModel : '" + model + '\'' ;

    }
}
