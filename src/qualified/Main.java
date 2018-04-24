package qualified;

public class Main {
    public static void main(String[] args) {
        City city1 = new City("ODS","Odessa");
        City city2 = new City("KV","Kiev");
        Country country1 = new Country("Ukraine");
        Country country2 = new Country("Poland");
        country1.addCityQual(city1);
        country1.addCityQual(city2);
        System.out.println(country1);
        country1.removeCityQual("ODS");
        System.out.println(country1);
        System.out.println(country2);
        System.out.println(country1.findCity("KV"));
    }
}
