package CollectionFramework;

import java.util.LinkedList;
import java.util.Collections;

public class JavaLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList to store car names
        LinkedList<String> cars = new LinkedList<>();

        // Add elements to the LinkedList
        System.out.println("Adding elements to the LinkedList...");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println("Current list of cars: " + cars);

        // Add an element at a specific position
        System.out.println("\nAdding 'Mazda' at position 0...");
        cars.add(0, "Mazda");
        System.out.println("List after adding Mazda at position 0: " + cars);

        // Add an element to the first position (like a queue)
        System.out.println("\nAdding 'Audi' at the beginning (using addFirst())...");
        cars.addFirst("Audi");
        System.out.println("List after adding Audi at the beginning: " + cars);

        // Add an element to the last position (like a queue)
        System.out.println("\nAdding 'Tesla' at the end (using addLast())...");
        cars.addLast("Tesla");
        System.out.println("List after adding Tesla at the end: " + cars);

        // Accessing an element at index 2
        System.out.println("\nAccessing the element at index 2: " + cars.get(2));

        // Change an element (set at position 0)
        System.out.println("\nChanging the car at position 0 from 'Audi' to 'Opel'...");
        cars.set(0, "Opel");
        System.out.println("List after change: " + cars);

        // Sorting the LinkedList
        System.out.println("\nSorting the LinkedList...");
        Collections.sort(cars);
        System.out.println("List after sorting: " + cars);

        // Reversing the LinkedList
        System.out.println("\nReversing the LinkedList...");
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println("List after reversing: " + cars);

        // Remove an element by index (removes the element at position 0)
        System.out.println("\nRemoving the car at position 0...");
        cars.remove(0);
        System.out.println("List after removal: " + cars);

        // Remove an element by value
        System.out.println("\nRemoving 'BMW' from the list...");
        cars.remove("BMW");
        System.out.println("List after removing 'BMW': " + cars);

        // Remove the first element (using removeFirst())
        System.out.println("\nRemoving the first car (using removeFirst())...");
        cars.removeFirst();
        System.out.println("List after removing the first car: " + cars);

        // Remove the last element (using removeLast())
        System.out.println("\nRemoving the last car (using removeLast())...");
        cars.removeLast();
        System.out.println("List after removing the last car: " + cars);

        // Check the size of the LinkedList
        System.out.println("\nSize of the LinkedList: " + cars.size());

        // Check if the list contains a specific car
        System.out.println("\nDoes the list contain 'Ford'? " + cars.contains("Ford"));

        // Iterating through the LinkedList using an enhanced for loop
        System.out.println("\nIterating through the LinkedList to print each car:");
        for (int i = 0; i< cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // Peek the first and last elements
        System.out.println("\nFirst car using peekFirst(): " + cars.peekFirst());
        System.out.println("Last car using peekLast(): " + cars.peekLast());

        // Push elements onto the LinkedList (like a stack)
        System.out.println("\nPushing 'Honda' onto the LinkedList (using push())...");
        cars.push("Honda");
        System.out.println("List after push(): " + cars);

        // Pop the first element (removes it and returns it)
        System.out.println("\nPopping the first car (using pop())...");
        String poppedCar = cars.pop();
        System.out.println("Popped car: " + poppedCar);
        System.out.println("List after pop(): " + cars);

        // Clear all elements
        System.out.println("\nClearing all elements from the LinkedList...");
        cars.clear();
        System.out.println("List after clear(): " + cars);
    }
}
