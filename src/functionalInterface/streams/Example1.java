package functionalInterface.streams;

import java.util.Set;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(20, 30, 40, 50);
        Stream<Integer> stream = numbers.stream();
        stream.forEach((number)-> System.out.println(number));
    }
}
