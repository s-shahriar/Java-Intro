package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store car names (String) as keys and car prices (Double) as values
        HashMap<String, Double> cars = new HashMap<String, Double>();

        // Add entries to the HashMap
        System.out.println("Adding car entries to the HashMap...");
        cars.put("Volvo", 35000.50);
        cars.put("BMW", 45000.75);
        cars.put("Ford", 28000.99);
        cars.put("Audi", 50000.00);
        cars.put("Tesla", 60000.40);
        System.out.println("Current car prices: " + cars);

        // Accessing a value using a key
        System.out.println("\nPrice of BMW: " + cars.get("BMW"));

        // Check if a key exists in the map
        System.out.println("\nDoes the HashMap contain 'Ford'? " + cars.containsKey("Ford"));

        // Check if a value exists in the map
        System.out.println("\nDoes the HashMap contain the price 50000.00? " + cars.containsValue(50000.00));

        // Removing an entry by key
        System.out.println("\nRemoving 'Ford' from the HashMap...");
        cars.remove("Ford");
        System.out.println("HashMap after removal: " + cars);

        // Checking the size of the HashMap
        System.out.println("\nSize of the HashMap: " + cars.size());

        // Iterating through the HashMap using a for-each loop (entrySet)
        System.out.println("\nIterating through the HashMap using entrySet()...");
        for (Map.Entry<String, Double> entry : cars.entrySet()) {
            System.out.println(entry.getKey() + " costs $" + entry.getValue());
        }

        // Checking if the HashMap is empty
        System.out.println("\nIs the HashMap empty? " + cars.isEmpty());

        // Replacing an entry's value (update the price of Audi)
        System.out.println("\nUpdating the price of Audi...");
        cars.put("Audi", 52000.00);  // Updating the value associated with the key "Audi"
        System.out.println("HashMap after update: " + cars);

        // Clear all entries
        System.out.println("\nClearing all entries from the HashMap...");
        cars.clear();
        System.out.println("HashMap after clearing: " + cars);
    }
}
