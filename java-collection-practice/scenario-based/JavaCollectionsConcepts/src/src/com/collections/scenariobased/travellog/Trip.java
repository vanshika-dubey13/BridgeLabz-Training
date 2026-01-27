package src.com.collections.scenariobased.travellog;
import java.io.Serializable;
import java.time.LocalDate;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

import java.io.Serializable;
import java.time.LocalDate;

public class Trip implements Serializable {
	
	//attributes
    private static final long serialVersionUID = 1L;

    private String city;
    private String country;
    private LocalDate startDate;
    private LocalDate endDate;
    private String notes;

    public Trip(String city, String country, LocalDate startDate, LocalDate endDate, String notes) {
        this.city = city;
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
        this.notes = notes;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getNotes() {
        return notes;
    }

    public int getDurationDays() {
        return (int) java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate) + 1;
    }

    @Override
    public String toString() {
        return city + ", " + country + " (" + startDate + " to " + endDate + ") - " + notes;
    }
}
