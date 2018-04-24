package qualified;

public class City {
    private String cityId;
    private String cityName;
    private Country country;

    public City(String cityId, String cityName) {
        this.setCityId(cityId);
        this.setCityName(cityName);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        if (cityName == null) {
            throw new IllegalArgumentException("Name shouldn't be null");
        }
        this.cityName = cityName;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        if(cityId == null){
            throw new IllegalArgumentException("cityId shouldn'n be null");
        }
        this.cityId = cityId;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country newCountry) {
        if (newCountry == null) {
            throw new IllegalArgumentException("Country shouldn't be null");
        }
        this.country = newCountry;
        newCountry.addCityQual(this);
    }

    @Override
    public String toString() {
        return getCityName() + " - " + country.getCountryName();
    }

}
