package app;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates basic operations with different types of HashMaps.
 * <p>
 * This class showcases operations like adding, removing, and iterating
 * over HashMap entries with different types of key-value pairs.
 * </p>
 */
public class PlayMap {

    /**
     * The main entry point for the application.
     * 
     * @param args Command line arguments. Not used in this application.
     */
    public static void main(String[] args) {
        // Create a Map of Integers keyed by Integers
        Map<Integer, Integer> integerMap = new HashMap<>();
        integerMap.put(1, 1);
        integerMap.put(2, 2);
        
        // Create a Map of Strings keyed by Integers
        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1, "One");
        stringMap.put(2, "Two");
        
        // Create a Map of Strings keyed by Strings
        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("FirstName", "Mark");
        nameMap.put("LastName", "Reha");
        
        // Print out size and if a Map is empty
        System.out.printf("Name Map Tests: size is %d and is empty: %b%n", nameMap.size(), nameMap.isEmpty());
        
        // Use a For Loop to loop over the Keys to retrieve each Map Value
        for (Map.Entry<String, String> m : nameMap.entrySet()) {
            System.out.printf("Key: %s Value: %s%n", m.getKey(), m.getValue());
        }
        
        // Clear and remove elements from the Maps
        integerMap.clear();
        stringMap.remove(1);
        stringMap.clear();
        nameMap.clear();
    }
}
