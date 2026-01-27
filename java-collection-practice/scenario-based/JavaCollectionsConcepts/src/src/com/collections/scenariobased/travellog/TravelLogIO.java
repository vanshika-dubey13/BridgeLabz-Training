package src.com.collections.scenariobased.travellog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TravelLogIO {

    public static void saveTrips(List<Trip> trips, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(trips);
            System.out.println("Trips saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Trip> loadTrips(String filename) {
        List<Trip> trips = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            trips = (List<Trip>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found, returning empty list.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return trips;
    }
}

