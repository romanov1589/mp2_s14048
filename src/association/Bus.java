package association;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    private long id;
    private String regNumber;
    private Driver driver;

    public Bus(long id, String regNumber, Driver driver) {
        this.id = id;
        this.setRegNumber(regNumber);
        this.setDriver(driver);
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
        if(regNumber == null){
            throw new IllegalArgumentException("The bus should has a regestration number!");
        }
        this.regNumber = regNumber;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver newDriver) {
        if(newDriver == null){
            throw new IllegalArgumentException("Driver can't be null");
        }
        if(this.driver != newDriver){
            this.driver = newDriver;
            newDriver.setBus(this);
        }

    }

    public String toString(){
        return "Bus #" + getId() + " - " + getRegNumber() + '\n' + "Driver: " +  driver.getFirstName()
                + " " + driver.getLastName();

    }
}
