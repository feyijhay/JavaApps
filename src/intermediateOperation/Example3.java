package intermediateOperation;

import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> numbers = List.of("QWERTY", "ASDFG", "ABCDFFF", "ABC", "B");
        numbers.stream()
                .map((word)->word.length())
                .forEach(System.out::println);
    }
}
