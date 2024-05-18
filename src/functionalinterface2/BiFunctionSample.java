package functionalinterface2;

import java.util.function.BiFunction;

public class BiFunctionSample {

    public static void main(String[] args) {
        BiFunction<String,Integer, Boolean> biFunction = (word, number)-> {
            return word.length()==number;
        };

        Boolean result = biFunction.apply("Jagaban", 7);
        System.out.println(result);
    }
}
