package functionalinterface2;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
        Consumer<String> consumer = (s)->{
            System.out.println("i love " + s);;
        };

        List<String> names = List.of("Jumoke", "Bolaji", "Dayo");
        names.forEach(consumer);
    }
}
