package com.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounterMain {
    public static void main(String[] args) {

    	//sample paragraph to count words
        String paragraph = "java is an object oriented programming language and java is powerful";

        Map<String, Integer> wordCount =
            Arrays.stream(paragraph.split("\\s+"))
                  .collect(Collectors.toMap(
                	// key = word
                      word -> word,       
                      //initial count
                      word -> 1,          
                      //merge function for duplicates
                      Integer::sum         
                  ));

        System.out.println(wordCount);
    }
}

