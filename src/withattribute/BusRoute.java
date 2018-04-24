package withattribute;

import java.time.LocalDateTime;

public class BusRoute {
    private LocalDateTime departure;
    private LocalDateTime arrival;
    private Route route;
    private Bus bus;

    public BusRoute(LocalDateTime departure, LocalDateTime arrival, Route route, Bus bus) {
        this.setDeparture(departure);
        this.setArriwal(arrival);
        this.setRoute(route);
        this.setBus(bus);
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDateTime departure) {
        if (departure == null) {
            throw new IllegalArgumentException("Please, set departure date and time!");
        }
        this.departure = departure;
    }

    public LocalDateTime getArriwal() {
        return arrival;
    }

    public void setArriwal(LocalDateTime arrival) {
        if (arrival == null) {
            throw new IllegalArgumentException("Please, set arrival date and time!");
        }
        this.arrival = arrival;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route newRoute) {
        if (newRoute == null) {
            throw new IllegalArgumentException("Please, set a route!");
        }
        if (this.route != null && this.route != newRoute) {
            removeRoute();
        }
        this.route = newRoute;
        newRoute.addBusRoute(this);

    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus newBus) {
        if (newBus == null) {
            throw new IllegalArgumentException("Please set a bus!");
        }
        if (this.bus != null && this.bus != newBus) {
            removeBus();
        }
        this.bus = newBus;
        newBus.addBusRoute(this);
    }

    public void removeRoute() {
        this.route.removeBusRoute(this);
        this.route = null;
    }

    public void removeBus() {
        this.bus.removeBusRoute(this);
        this.bus = null;
    }

    public String toString() {
        return "(" + getDeparture() + "-" + getArriwal() + ") " + getRoute() + " -> " + getBus();
    }

}
