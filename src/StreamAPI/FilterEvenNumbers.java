package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

    // Loop based implementation
    public static class LoopImplementation{
        public List<Integer> getEvenNumbers(List<Integer> numbers){
            // Initialize an empty list to hold even numbers
            List<Integer> evens = new ArrayList<>();

            for (Integer number: numbers){
                if (number % 2 == 0){
                    evens.add(number);
                }
            }
            return evens;
        }
    }

    // Stream based implementation
    public static class StreamImplementation{
        public List<Integer> getEvenNumbers(List<Integer> numbers){
            // Use Stream api to filter even numbers
            List<Integer> evens = new ArrayList<>();

            evens = numbers.stream()
                    .filter(n -> n % 2 ==0)
                    .collect(Collectors.toList());
            return evens;
        }
    }

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        LoopImplementation Loop = new LoopImplementation();
        StreamImplementation Stream = new StreamImplementation();

        // Loop-based implementation
        System.out.println("Filtering even numbers using a loop:");
        System.out.println(Loop.getEvenNumbers(numbers)); // Output: [10, 20, 30]

        // Stream-based implementation
        System.out.println("Filtering even numbers using streams:");
        System.out.println(Stream.getEvenNumbers(numbers)); // Output: [10, 20, 30]
    }
}
