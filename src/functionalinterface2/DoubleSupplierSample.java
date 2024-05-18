package functionalinterface2;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;

public class DoubleSupplierSample {

    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = ()->5;{


            System.out.println( doubleSupplier.getAsDouble());
        };



    }
}
