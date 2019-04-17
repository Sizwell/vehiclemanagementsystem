package za.ac.cput.vehiclemanagementsystem.Domain;

public class VehicleManagement {

    private String vehicleDetails;

    public VehicleManagement()
    {

    }

    public VehicleManagement(Builder builder)
    {
        this.vehicleDetails = builder.vehicleDetails;
    }

    public static class Builder
    {
        private String vehicleDetails;

        public Builder details(String details)
        {
            this.vehicleDetails = details;
            return this;
        }

        public VehicleManagement build()
        {
            return new VehicleManagement(this);
        }
    }

    public String getVehicleDetails()
    {
        return vehicleDetails;
    }



    @Override
    public String toString() {
        return "------ Vehicle Management ------\n{" +
                "Vehicle Details :'" + vehicleDetails + '\'' +
                '}';
    }
}
