package withattribute;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private long id;
    private String name;
    List<BusRoute> busRouteList = new ArrayList<>();

    public Route(long id, String name) {
        this.id = id;
        this.setName(name);
    }

    public void addBusRoute(BusRoute busRoute) {
        if (busRoute == null) {
            throw new IllegalArgumentException("BusRoute shouldn't be null!");
        }
        if (!busRouteList.contains(busRoute)) {
            busRouteList.add(busRoute);
        }
    }

    public void removeBusRoute(BusRoute busRoute) {
        busRouteList.remove(busRoute);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Route isn't named!");
        }
        this.name = name;
    }

    public List<BusRoute> getBusRouteList() {
        return busRouteList;
    }

    public String toString() {
        return getName();

    }
}
