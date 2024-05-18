package functionalinterface2;

import java.util.function.DoublePredicate;

public class DoublePredicateSample {
    public static void main(String[] args) {
        DoublePredicate doublePredicate = (value) -> value / 2==0; {

            System.out.println(  doublePredicate.test(10));

        };



    }

}