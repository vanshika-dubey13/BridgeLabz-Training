package com.streamapi;

import java.util.*;

/*creating a class to .map() to convert list of names to uppercase and
.sorted() to display them alphabetically.
*/

public class CustomerNames {
    public static void main(String[] args) {

    	//creating a list of names of person
        List<String> names = List.of(
            "john",
            "alice",
            "bob",
            "diana"
        );
        names.stream()
        // convert to uppercase
       .map(String::toUpperCase)
        // sort alphabetically
        .sorted()                 
        .forEach(System.out::println);
    }
}
