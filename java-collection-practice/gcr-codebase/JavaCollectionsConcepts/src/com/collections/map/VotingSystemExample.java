package com.collections.map;

import java.util.*;

public class VotingSystemExample {

	//main method
    public static void main(String[] args) {
        System.out.println("=== Voting System ===");

        // HashMap: candidate -> votes
        Map<String, Integer> voteMap = new HashMap<>();
        voteMap.put("Alice", 10);
        voteMap.put("Bob", 15);
        voteMap.put("Charlie", 7);

        // TreeMap: sorted by candidate name
        Map<String, Integer> sortedVotes = new TreeMap<>(voteMap);

        System.out.println("Sorted Results (TreeMap):");
        sortedVotes.forEach((c, v) -> System.out.println(c + " = " + v));

        // LinkedHashMap: maintain insertion order
        Map<String, Integer> insertionOrderVotes = new LinkedHashMap<>();
        insertionOrderVotes.put("Alice", 10);
        insertionOrderVotes.put("Bob", 15);
        insertionOrderVotes.put("Charlie", 7);

        System.out.println("\nInsertion Order Results (LinkedHashMap):");
        insertionOrderVotes.forEach((c, v) -> System.out.println(c + " = " + v));

        // Determine winner
        String winner = Collections.max(voteMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nWinner: " + winner);
    }
}

