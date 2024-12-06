package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {

    public static class LoopImplementation{
        public int sum(List<Integer> numbers){
            int total = 0;
            for (Integer number: numbers){
                total += number;
            }
            return total;
        }
    }

    public static class StreamImplementation{
        public int sum(List<Integer> numbers){
            int total = 0;
            total = numbers.stream()
                    .reduce(0,Integer::sum);
            return total;
        }
    }

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        StreamImplementation Stream = new StreamImplementation();
        LoopImplementation Loop = new LoopImplementation();

        // Loop-based implementation
        System.out.println("Summing numbers using a loop:");
        int sumWithLoop = Loop.sum(numbers);
        System.out.println("Sum (Loop): " + sumWithLoop); // Output: 100

        // Stream-based implementation
        System.out.println("Summing numbers using streams:");
        int sumWithStream = Stream.sum(numbers);
        System.out.println("Sum (Stream): " + sumWithStream); // Output: 100
    }
}
