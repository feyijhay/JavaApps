package functionalinterface2;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;

public class DoubleSupplierSample {

    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = (value)->{
            return value;

        };

    }
}
