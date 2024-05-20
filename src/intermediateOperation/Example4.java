package intermediateOperation;

import java.util.stream.IntStream;

public class Example4 {
    public static void main(String[] args) {
        String word = "Hello";

        IntStream intStream = word.chars();
        intStream.forEach(System.out::println);
    }
}
