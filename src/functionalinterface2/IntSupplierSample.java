package functionalinterface2;

import java.util.function.IntSupplier;

public class IntSupplierSample {
    public static void main(String[] args) {
        IntSupplier intSupplier = ()->{
            return Integer.parseInt(null);
        };



    }
}
