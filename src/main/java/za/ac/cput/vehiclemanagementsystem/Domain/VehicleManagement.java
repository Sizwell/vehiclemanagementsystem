package za.ac.cput.vehiclemanagementsystem.Domain;

public class VehicleManagement {

    private String vehicleID;
    private String vehicleDetails;

    public VehicleManagement() {

    }

    public VehicleManagement(Builder builder) {
        this.vehicleDetails = builder.vehicleID;
        this.vehicleDetails = builder.vehicleDetails;
    }

    public static class Builder {

        private String vehicleID;
        private String vehicleDetails;

        public Builder vehicleID(String id){
            this.vehicleID = vehicleID;
            return this;
        }

        public Builder details(String details) {
            this.vehicleDetails = details;
            return this;
        }

        public VehicleManagement build() {
            return new VehicleManagement(this);
        }
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }


    @Override
    public String toString() {
        return "------ Vehicle Management ------\n{" +
                "Vehicle id : '" + vehicleID + "\n" +
                "Vehicle Details :'" + vehicleDetails + '\'' +
                '}';
    }
}
