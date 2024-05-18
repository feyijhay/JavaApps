package functionalinterface2;

import java.util.function.BiPredicate;

public class BiPredicateSample {

    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (word, number)->{

            return word.length()==number;
        };

        Boolean answer = biPredicate.test ("Jumoke", 3);
        System.out.println(answer);
    }
}
