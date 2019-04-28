package za.ac.cput.vehiclemanagementsystem.Domain;

public class Routes {

    private int routeNo;
    private String routeName;
    private String destination;

    public Routes() {

    }

    public Routes(Builder builder) {
        this.routeNo = builder.routeNo;
        this.routeName = builder.routeName;
        this.destination = builder.destination;
    }

    public static class Builder {
        private int routeNo;
        private String routeName;
        private String destination;

        public Builder routeNo(int rNo) {
            this.routeNo = rNo;
            return this;
        }

        public Builder routeName(String rName) {
            this.routeName = rName;
            return this;
        }

        public Builder destination(String destine) {
            this.destination = destine;
            return this;
        }

        public Routes build() {
            return new Routes(this);
        }

    }

    public int getRouteNo() {
        return routeNo;
    }

    public String getRouteName() {
        return routeName;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "------ Routes ------\n" +
                "Route No : " + routeNo +
                "\nRoute Name : '" + routeName + '\'' +
                "\nDestination : '" + destination + '\'';
    }
}
