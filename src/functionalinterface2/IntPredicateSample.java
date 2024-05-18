package functionalinterface2;

import java.util.function.IntPredicate;

public class IntPredicateSample {
    public static void main(String[] args) {
        IntPredicate intPredicate = (value)-> value + 10 == 0;{
            System.out.println(intPredicate.test(10));
        };




    }
}
