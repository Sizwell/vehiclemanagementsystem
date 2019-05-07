package za.ac.cput.vehiclemanagementsystem.Factory.RoutesFactory;


import za.ac.cput.vehiclemanagementsystem.Domain.Routes.Routes;

public class RouteFactory {

    public static Routes getDeduction(int no, String name, String destination) {
        return new Routes.Builder()
                .routeNo(no)
                .routeName(name)
                .destination(destination)
                .build();
    }
}
