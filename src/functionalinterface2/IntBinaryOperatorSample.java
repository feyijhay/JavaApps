package functionalinterface2;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorSample {

    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (value, num)-> value / num;{
            System.out.println(intBinaryOperator.applyAsInt(10, 2));
        };
    }
}
