package src.com.collections.scenariobased.travellog;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TravelLogAnalyzer {

    //  Search all cities matching regex
    public static List<Trip> searchCities(List<Trip> trips, String regex) {
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        return trips.stream()
                .filter(trip -> pattern.matcher(trip.getCity()).find())
                .collect(Collectors.toList());
    }

    //  Trips longer than 5 days
    public static List<Trip> tripsLongerThan(List<Trip> trips, int days) {
        return trips.stream()
                .filter(trip -> trip.getDurationDays() > days)
                .collect(Collectors.toList());
    }

    //  Unique countries
    public static Set<String> uniqueCountries(List<Trip> trips) {
        return trips.stream()
                .map(Trip::getCountry)
                .collect(Collectors.toSet());
    }

    //  Top N cities visited most often
    public static List<String> topCities(List<Trip> trips, int topN) {
        Map<String, Integer> cityCount = new HashMap<>();
        for (Trip trip : trips) {
            cityCount.put(trip.getCity(), cityCount.getOrDefault(trip.getCity(), 0) + 1);
        }

        return cityCount.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
                .limit(topN)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}

