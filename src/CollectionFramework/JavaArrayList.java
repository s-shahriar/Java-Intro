package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of cars
        ArrayList<String> cars = new ArrayList<String>();

        // Adding elements to the ArrayList
        System.out.println("Adding elements to the ArrayList...");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println("Current list of cars: " + cars);

        // Add an element at a specific position
        System.out.println("\nAdding 'Mazda' at position 0...");
        cars.add(0, "Mazda");
        System.out.println("List after adding Mazda at position 0: " + cars);

        // Accessing an element at index 2
        System.out.println("\nAccessing the element at index 2: " + cars.get(2));

        // Change an element (set at position 0)
        System.out.println("\nChanging the car at position 0 from 'Mazda' to 'Opel'...");
        cars.set(0, "Opel");
        System.out.println("List after change: " + cars);

        // Remove an element (removing the car at position 0)
        System.out.println("\nRemoving the car at position 0...");
        cars.remove(0);
        System.out.println("List after removal: " + cars);

        // Check the size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + cars.size());

        // Iterating through the ArrayList to print each element
        System.out.println("\nIterating through the ArrayList to print each car:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car at index " + i + ": " + cars.get(i));
        }

        // Sorting the ArrayList alphabetically
        System.out.println("\nSorting the ArrayList...");
        Collections.sort(cars);
        System.out.println("List after sorting: " + cars);

        // Reversing the ArrayList
        System.out.println("\nReversing the ArrayList...");
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println("List after reversing: " + cars);
    }
}
