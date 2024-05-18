package functionalinterface2;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionSample {
    public static void main(String[] args) {
        DoubleToIntFunction doubleToIntFunction = (value)->  Double.valueOf(value).intValue();{
            System.out.println(doubleToIntFunction.applyAsInt(55566.6786545));

        };

    }
}
