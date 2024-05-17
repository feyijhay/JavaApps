package fireDrillOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAndMinimumTest {

    @Test
    public void MinMaxTest(){
        MaximumAndMinimum maxMin = new MaximumAndMinimum();
        int[] numbers = {2,4,5,7};
        int[] result = {5};
        assertArrayEquals(result, maxMin.getMin(numbers));
    }




}