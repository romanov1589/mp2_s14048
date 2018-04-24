package association;

public class Main {

    public static void main(String[] args) {
    Driver driver1 = new Driver(1, "Igor", "Romanov");
    Driver driver2 = new Driver(2, "Jan", "Kowalski");
    Bus bus1 = new Bus(1, "YY1111", driver1);
    Bus bus2 = new Bus(2, "YY3322", driver2);
        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(bus1);
        System.out.println(bus2);
        bus1.setDriver(driver2);
        bus2.setDriver(driver1);
        driver1.setBus(null);
        driver2.setBus(null);
        System.out.println("=======================================");
        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(bus1);
        System.out.println(bus2);
    }
}
