package functionalinterface2;

import java.util.function.BinaryOperator;

public class BinaryOperatorSample {

    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (name, surname)-> name + surname;
        System.out.println(binaryOperator.apply("Jumoke", " " +  "Joseph"));

    }
}
