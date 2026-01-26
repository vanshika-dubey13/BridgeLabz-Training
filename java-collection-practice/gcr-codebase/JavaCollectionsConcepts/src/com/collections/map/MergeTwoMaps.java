package com.collections.map;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {

	//main method
    public static void main(String[] args) {

    	//creating map1
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

      //creating map2
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> map3 = new HashMap<>(map1);

        // Merging map2 into mergedMap
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
        	map3.put(
                entry.getKey(),
                map3.getOrDefault(entry.getKey(), 0) + entry.getValue()
            );
        }

        
        //displaying merged map
        System.out.println("Map 1 : " + map1);
        System.out.println("Map 2 : " + map2);
        System.out.println("Merged Map: " + map3);
    }
}
