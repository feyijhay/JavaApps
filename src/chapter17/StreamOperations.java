package chapter17;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamOperations {

    public static Collection<Integer> getEvenNumbersOf(List<Integer> numbers){
        return numbers.stream()
                .filter((number)->number%2==0)
                .collect(Collectors.toCollection(TreeSet::new));

    }


    public static Map<Integer, String> mapCodePointToCharacter(List<Integer> codePoints){
        return codePoints.stream()
                .collect(Collectors.toMap((codepoint)->codepoint,Character::toString));
    }


}
