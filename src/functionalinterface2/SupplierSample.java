package functionalinterface2;

import java.util.function.Supplier;

public class SupplierSample {

    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 5;

        System.out.println(supplier.get());
    }

}