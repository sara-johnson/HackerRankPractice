package AmazonOA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NearestCities {

    public static List<String> nearestCities(int numOfCities, List<String> cities, List<Integer> xCoordinates,
                                             List<Integer> yCoordinates, int numOfQueries, List<String> queries) {

        Map<Integer, ArrayList<City>> xCoordByCity = new HashMap<>();
        Map<Integer, ArrayList<City>> yCoordByCity = new HashMap<>();
        Map<String, City> nameByCity = new HashMap<>();

        for (int i = 0; i < numOfCities; i++) {

            City city = new City(cities.get(i), xCoordinates.get(i), yCoordinates.get(i));

            xCoordByCity.putIfAbsent(city.xCoord, new ArrayList<>());
            yCoordByCity.putIfAbsent(city.yCoord, new ArrayList<>());

            xCoordByCity.get(city.xCoord).add(city);
            yCoordByCity.get(city.yCoord).add(city);

            nameByCity.put(city.cityName, city);
        }

        List<String> resultingCityNames = new ArrayList<>();

        Map<String, String> queryMapping = new HashMap<>();

        for (int i = 0; i < numOfQueries; i++) {
            if (queryMapping.containsKey(queries.get(i))) {
                resultingCityNames.add(queries.get(i));
                continue;
            }

            String closestCityName = "";
            int closestCityDistance = Integer.MAX_VALUE;

            City currentCity = nameByCity.get(queries.get(i));

            List<City> matchingCities = xCoordByCity.get(currentCity.xCoord);
            matchingCities.addAll(yCoordByCity.get(currentCity.yCoord));

            for (City matchedCity : matchingCities) {
                if (matchedCity.equals(currentCity)) {
                    continue;
                }

                int distanceToMatchedCity = distanceFromKnownCity(currentCity, matchedCity);

                if (closestCityName.isEmpty() || distanceToMatchedCity < closestCityDistance ||
                    distanceToMatchedCity == closestCityDistance && matchedCity.cityName.compareTo(closestCityName) < 0) {
                    closestCityName = matchedCity.cityName;
                    closestCityDistance = distanceToMatchedCity;
                }
            }

            if (!closestCityName.isEmpty()) {
                resultingCityNames.add(closestCityName);
                queryMapping.put(queries.get(i), closestCityName);
            } else {
                resultingCityNames.add("NONE");
            }
        }

        return resultingCityNames;
    }

    private static int distanceFromKnownCity(City currentCity, City matchedCity) {
        return Math.abs(currentCity.xCoord - matchedCity.xCoord) + (currentCity.yCoord - matchedCity.yCoord);
    }

    public static class City {
        String cityName;
        int xCoord;
        int yCoord;

        public City(String cityName, int xCoord, int yCoord) {
            this.cityName = cityName;
            this.xCoord = xCoord;
            this.yCoord = yCoord;
        }
    }
}
