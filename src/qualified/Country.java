package qualified;

import java.util.HashMap;
import java.util.Map;

public class Country {
    private String countryName;
    Map<String, City> cityQual = new HashMap<>();

    public Country(String name) {
        this.setCountryName(name);
    }

    public void addCityQual(City newCity) {
        if (newCity == null) {
            throw new IllegalArgumentException("City shouldn't be null");
        }
        if (!cityQual.containsKey(newCity.getCityId())) {
            cityQual.put(newCity.getCityId(), newCity);
            newCity.setCountry(this);
        }

    }

    public void removeCityQual(String cityId) {
        cityQual.remove(cityId);
    }

    public Map<String, City> getCityQual() {
        return this.cityQual;
    }

    public City findCity(String cityId) {
        if (this.cityQual.containsKey(cityId)) {
            return this.cityQual.get(cityId);
        } else {
            throw new IllegalArgumentException("This city doesn't exist");
        }
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name shouldn't be null!");
        }
        this.countryName = name;
    }

    @Override
    public String toString() {
        return getCountryName() + '\n' + "ID: " + getCityQual().keySet() + ": " + getCityQual().values();

    }
}
