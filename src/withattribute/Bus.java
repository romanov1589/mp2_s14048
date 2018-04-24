package withattribute;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private long id;
    private String regNumber;
    ArrayList<BusRoute> busRouteList = new ArrayList<>();

    public Bus(long id, String regNumber) {
        this.id = id;
        this.setRegNumber(regNumber);
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

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            throw new IllegalArgumentException("Bus should has a register number");
        }
        this.regNumber = regNumber;
    }

    public List<BusRoute> getBusRouteList() {
        return busRouteList;
    }

    public String toString() {
        return regNumber;
    }
}
