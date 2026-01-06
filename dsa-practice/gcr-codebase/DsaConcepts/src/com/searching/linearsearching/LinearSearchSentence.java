package com.searching.linearsearching;

import java.util.Scanner;

public class LinearSearchSentence {

    // Method to perform linear search
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
        	//checking if sentence contains specific word 
            if (sentence.contains(word)) {
                return sentence; 
            }
        }
        return "Not Found"; 
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	//asking for size of string arr elements from user
    	System.out.println("Enter size of sentence array : ");
    	int size = sc.nextInt();
    	sc.nextLine();
    	
    	String[] sentences = new String[size];
    	
    	for(int i=0; i<sentences.length; i++) {
    		System.out.println("Enter " +(i+1)+ " sentence : ");
    		sentences[i] = sc.nextLine();
    	}
    	
    	//asking user for word to search in sentence arr
    	System.out.println("Enter word to search in string array");
        String word = sc.next();

        String result = findSentenceWithWord(sentences, word);
        System.out.println(result);
    }
}

