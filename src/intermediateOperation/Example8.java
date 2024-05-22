package intermediateOperation;

import java.util.List;
import java.util.stream.Stream;

public class Example8 {
    public static void main(String[] args) {
        List<String> lists = List.of(
                "ABCD", "HELLO", "HEY"
        );

        System.out.println(lists.stream().flatMap((element)-> Stream.of(new StringBuilder(element).reverse())).toList().stream());
    }
}
