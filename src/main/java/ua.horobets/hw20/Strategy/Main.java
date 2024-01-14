package ua.horobets.hw20.Strategy;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        RouteStrategy walkRoute = new WalkRoute();
        RouteStrategy busRoute = new BusRoute();
        RouteStrategy carRoute = new CarRoute();
        navigator.calculateRouteByGivenStrategy("Kyiv", walkRoute);
        navigator.calculateRouteByGivenStrategy("Kyiv", busRoute);
        navigator.calculateRouteByGivenStrategy("Kyiv", carRoute);
    }
}
