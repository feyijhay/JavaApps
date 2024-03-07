import DoubleArray.DoubleArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


 public class DoubleArrayTest {

    @Test
    public void testThatArrayCanDoubleSize(){
        DoubleArray myDoubleArray = new DoubleArray();
        int[] array = new int[3];
        assertEquals(6, myDoubleArray.array(array).length);
    }

    @Test
    public void testThatArrayCanDoubleTheElement(){
        DoubleArray myDoubleArray = new DoubleArray();
        int[] array = {2,4,6};
        assertArrayEquals(new int[]{2, 4, 6, 4, 8, 12}, myDoubleArray.doubleArray(array));

    }

}
