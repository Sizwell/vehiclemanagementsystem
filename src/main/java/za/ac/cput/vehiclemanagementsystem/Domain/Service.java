package za.ac.cput.vehiclemanagementsystem.Domain;

public class Service {

    private String vinNo;
    private String model;
    private String make;

    public Service()
    {

    }

    public Service(Builder builder)
    {
        this.vinNo = builder.vinNo;
        this.model = builder.model;
        this.make = builder.make;
    }

    public static class Builder
    {
        private String vinNo;
        private String model;
        private String make;

        public Builder vinNo(String vin)
        {
            this.vinNo = vin;
            return this;
        }

        public Builder make(String make)
        {
            this.make = make;
            return this;
        }

        public Builder model(String model)
        {
            this.model = model;
            return this;
        }

        public Service build()
        {
            return new Service(this);
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

    public String getMake()
    {
        return make;
    }

    @Override
    public String toString() {
        return "------ Register Vehicle ------\n" +
                "VIN No : " + vinNo +
                "\nModel : '" + model + '\'' +
                "\nMake : '" + make + '\'';

    }
}