package withattribute;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(1, "KKY1111");
        Bus bus2 = new Bus(2, "XX1331");
        Route route1 = new Route(1, "Warszawa-Odessa");
        Route route2 = new Route(2, "Warszawa-Kiev");
        Route route3 = new Route(3, "Warszawa-Oslo");

        BusRoute busRoute = new BusRoute(LocalDateTime.of(2018, 12, 11, 11, 33),
                LocalDateTime.of(2018, 12, 12, 11, 00), route1, bus1);
        BusRoute busRoute1 = new BusRoute(LocalDateTime.of(2018, 11, 10, 9, 10),
                LocalDateTime.of(2018, 11, 10, 19, 00), route2, bus2);
        BusRoute busRoute2 = new BusRoute(LocalDateTime.of(2018, 10, 9, 19, 22),
                LocalDateTime.of(2018, 10, 10, 5, 55), route1, bus1);
        System.out.println(route1.getBusRouteList());
        busRoute2.removeRoute();
        System.out.println(route1.getBusRouteList());
        busRoute2.setRoute(route3);
        System.out.println(route3.getBusRouteList());
        System.out.println(busRoute2);
        busRoute.removeBus();
        System.out.println(busRoute);
        busRoute.setBus(bus2);
        //busRoute.setRoute(route2);
        System.out.println(busRoute);
        System.out.println(bus2.getBusRouteList());

    }
}
