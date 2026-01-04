package com.dsa.hashset.longestconsecutivesequence;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static int longestConsecutiveSequence(int[] arr) {
		HashSet<Integer> set = new HashSet<>();

	    // Adding all elements to the set
	    for (int num : arr) {
	    		set.add(num);
	    }
	    int longest = 0;
	    for (int num : arr) {
	    	// Checking if this is the start of a sequence
	    	if (!set.contains(num - 1)) {
	    		int currentNum = num;
	            int count = 1;
	            // Count consecutive numbers
	            while (set.contains(currentNum + 1)) {
	            	currentNum++;
	                count++;
	            }
	            longest = Math.max(longest, count);
	         }
	     }
	     return longest;
	  }
}
