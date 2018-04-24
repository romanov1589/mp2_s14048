package association;

public class Driver {
    private long id;
    private String firstName;
    private String lastName;
    private Bus bus;

    public Driver(long id, String firstName, String lastName) {
        this.id = id;
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("Driver should has first name!");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Driver should has second name!");
        }
        this.lastName = lastName;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus newBus) {
        if (this.bus != newBus) {
            this.bus = newBus;
            if (newBus != null) {
                newBus.setDriver(this);
            }
        }
    }

    public String toString() {
        return "Driver #" + getId() + " - " + getFirstName() + " " + getLastName() + '\n'
                + "Bus: " + (bus != null ? bus.getRegNumber() : "");
    }
}
