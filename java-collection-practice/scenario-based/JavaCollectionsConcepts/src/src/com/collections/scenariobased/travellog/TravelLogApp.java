package src.com.collections.scenariobased.travellog;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class TravelLogApp {
    public static void main(String[] args) {
        List<Trip> trips = List.of(
                new Trip("Paris", "France", LocalDate.of(2023, 3, 1), LocalDate.of(2023, 3, 6), "Visited museums"),
                new Trip("Berlin", "Germany", LocalDate.of(2023, 4, 10), LocalDate.of(2023, 4, 12), "Tech conference"),
                new Trip("Paris", "France", LocalDate.of(2023, 5, 5), LocalDate.of(2023, 5, 10), "Food tour"),
                new Trip("Rome", "Italy", LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), "Historical sites")
        );

        // Save trips
        TravelLogIO.saveTrips(trips, "trips.dat");

        // Load trips
        List<Trip> loadedTrips = TravelLogIO.loadTrips("trips.dat");

        // Search cities with "Par"
        System.out.println("Cities matching 'Par': " + TravelLogAnalyzer.searchCities(loadedTrips, "Par"));

        // Trips longer than 5 days
        System.out.println("Trips longer than 5 days: " + TravelLogAnalyzer.tripsLongerThan(loadedTrips, 5));

        // Unique countries
        Set<String> countries = TravelLogAnalyzer.uniqueCountries(loadedTrips);
        System.out.println("Unique countries: " + countries);

        // Top 3 cities
        List<String> topCities = TravelLogAnalyzer.topCities(loadedTrips, 3);
        System.out.println("Top 3 cities visited: " + topCities);
    }
}

