package functionalinterface2;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionSample {

    public static void main(String[] args) {
        DoubleToLongFunction doubleToLongFunction = (value)-> Long.valueOf((long) value);{
            System.out.println( doubleToLongFunction.applyAsLong(122222222.0333333));

        };
       ;
    }
}
