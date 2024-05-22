package chapter17;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static chapter17.StreamOperations.*;
import static org.junit.jupiter.api.Assertions.*;

class StreamOperationsTest {

    @Test
    public void testGetEvenNumbers(){
        List<Integer> numbers = List.of(1,2,2,3,4,4,5,6,7,8,9,10);
        var evenNumbers = getEvenNumbersOf(numbers);
        System.out.printf("even numbers of: %s are %s", numbers, evenNumbers);

        assertNotNull(evenNumbers);
        assertEquals(5, evenNumbers.size());

    }


    @Test
    public void testMapCodePointToCharacter(){
        List<Integer> codePoints = List.of(65,97,98,66,69,48);
        Map<Integer, String> map = mapCodePointToCharacter(codePoints);
        Map<Integer, String> expected = Map.of( 65, "A",
                                                97, "a",
                                                98, "b",
                                                66, "B",
                                                69, "E",
                                                48, "0");
        assertNotNull(map);
        assertEquals(expected, map);

    }


}