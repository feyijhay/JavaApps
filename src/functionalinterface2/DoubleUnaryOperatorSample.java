package functionalinterface2;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorSample {

    public static void main(String[] args) {
        DoubleUnaryOperator doubleUnaryOperator = (value)-> value + 5;{
            System.out.println(doubleUnaryOperator.applyAsDouble(10));

        };
    }
}
