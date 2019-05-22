package za.ac.cput.vehiclemanagementsystem.Domain.Routes;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
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

        public Builder copyRoutes(Routes routes)
        {
            this.routeNo = routes.routeNo;
            this.routeName = routes.routeName;
            this.destination = routes.destination;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Routes)) return false;
        Routes routes = (Routes) o;
        return routeNo == routes.routeNo &&
                routeName.equals(routes.routeName) &&
                destination.equals(routes.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routeNo, routeName, destination);
    }
}
