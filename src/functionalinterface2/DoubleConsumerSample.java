package functionalinterface2;

import java.util.function.DoubleConsumer;

public class DoubleConsumerSample {
    public static void main(String[] args) {
        DoubleConsumer doubleConsumer  = (value)-> {


            System.out.println(value);


        };

            doubleConsumer.accept(15.0);


    }

}
