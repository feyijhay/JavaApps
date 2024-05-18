package functionalInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {

    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (name, surname)-> name + surname;
        System.out.println(binaryOperator.apply("Jumoke", " " +  "Joseph"));

    }
}
//LongUnaryOperator unaryOperator = (number)-> 2 * number;
//Long result = unaryOperator.applyAsLong(30);
//System.out.println(result);
