import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayLengthTest {
    @Test
    public void testThatArrayCanChangeElement(){
        ArrayLength myArray = new ArrayLength();
        int[] array = {2,3,4,8,8,8,9};
        assertArrayEquals(new int[]{0,1,0,0,0,0,1} , myArray.arrayElement(array));
    }




}
