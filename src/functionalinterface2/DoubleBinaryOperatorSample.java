package functionalinterface2;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorSample {

    public static void main(String[] args) {
        DoubleBinaryOperator doubleBinaryOperator = (right , left )->{
            return right + left;

        };

        Double result = doubleBinaryOperator.applyAsDouble(0.25, 0.25);
        System.out.println(result);
    }
}
