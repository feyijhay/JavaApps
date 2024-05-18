package functionalinterface2;

import java.util.function.IntConsumer;

public class IntConsumerSample {
    public static void main(String[] args) {
        IntConsumer intConsumer = (value)->{

            System.out.println(value);

        };
        intConsumer.accept(5);
    }
}
