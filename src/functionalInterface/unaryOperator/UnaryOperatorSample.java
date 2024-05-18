package functionalInterface.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (word)-> word + " i love you";{

        };
        System.out.println(unaryOperator.apply("Jumoke"));
    }
}
