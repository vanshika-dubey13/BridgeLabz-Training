package com.streamapi;

import java.util.*;
import java.util.stream.*;

//classs Movie to display movie details
class Movie {
	//attributes
    String name;
    double rating;
    int releaseYear;

    //constructor
    Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    //getter method
    public double getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return name + " (" + releaseYear + ") - " + rating;
    }
}

public class TopMovies {
    public static void main(String[] args) {

        List<Movie> movies = List.of(
            new Movie("Movie A", 8.9, 2023),
            new Movie("Movie B", 9.1, 2024),
            new Movie("Movie C", 8.5, 2022),
            new Movie("Movie D", 9.0, 2023),
            new Movie("Movie E", 8.7, 2024),
            new Movie("Movie F", 9.2, 2021)
        );

        List<Movie> top5Movies = movies.stream()
        	// filter recent movies
            .filter(m -> m.getReleaseYear() >= 2022) 
            .sorted(Comparator
                .comparing(Movie::getRating).reversed()
                .thenComparing(Movie::getReleaseYear).reversed())
            .limit(5)
            .collect(Collectors.toList());

        top5Movies.forEach(System.out::println);
    }
}

