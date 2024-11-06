package CollectionFramework;

import java.util.*;

public class JavaQueueAndPriorityQueue {
    public static void main(String[] args) {

        // --- Basic Queue Example (FIFO) ---
        System.out.println("----- Basic Queue Example (FIFO) -----");

        Queue<String> queue = new LinkedList<>();  // Create a Queue using LinkedList

        // Adding elements to the queue
        queue.offer("Volvo");  // offer() adds to the end of the queue
        queue.offer("BMW");
        queue.offer("Ford");
        queue.offer("Tesla");

        // Print the queue
        System.out.println("Queue after adding elements: " + queue);

        // Removing an element from the front of the queue (FIFO)
        System.out.println("\nRemoving from the queue (FIFO): " + queue.poll()); // poll() removes the front element

        // Peek the front element (does not remove it)
        System.out.println("Front element using peek(): " + queue.peek());  // peek() returns the front element but does not remove it

        // Check the size of the queue
        System.out.println("Size of the queue: " + queue.size());

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Check if a specific element is present
        System.out.println("Does the queue contain 'BMW'? " + queue.contains("BMW"));

        // Iterating through the queue using an enhanced for loop
        System.out.println("\nIterating through the Queue:");
        for (String car : queue) {
            System.out.println(car);
        }

        // Clear the queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);


        // --- PriorityQueue Example (Based on Natural Ordering) ---
        System.out.println("\n----- PriorityQueue Example (Based on Natural Ordering) -----");

        // Creating a PriorityQueue (elements will be ordered naturally)
        PriorityQueue<Integer> pq = new PriorityQueue<>();  // Default ordering is ascending for numbers

        pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);
        pq.add(40);

        // Print the priority queue (not ordered until we remove elements)
        System.out.println("PriorityQueue elements (not yet removed): " + pq);

        // Removing elements from the priority queue (elements are removed in order of priority)
        System.out.println("\nRemoving elements from the PriorityQueue in order of priority:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());  // poll() removes and returns the lowest priority element (in this case, the smallest number)
        }

        // --- PriorityQueue with Custom Comparator ---
        System.out.println("\n----- PriorityQueue Example (With Custom Comparator) -----");

        // Creating a PriorityQueue with custom ordering (descending order)
        PriorityQueue<String> pqCars = new PriorityQueue<>(Collections.reverseOrder());  // Custom comparator (reverse order)

        pqCars.add("Volvo");
        pqCars.add("BMW");
        pqCars.add("Ford");
        pqCars.add("Tesla");

        // Print the priority queue (not ordered until we remove elements)
        System.out.println("PriorityQueue elements (not yet removed): " + pqCars);

        // Removing elements from the priority queue (elements are removed based on custom priority)
        System.out.println("\nRemoving elements from the PriorityQueue in reverse alphabetical order:");
        while (!pqCars.isEmpty()) {
            System.out.println(pqCars.poll());  // poll() removes and returns the highest priority element (in this case, the one with the highest alphabetical order)
        }
    }
}
