import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ArrayOfOneAndZerosTest {
    @Test
    public void thatThatArrayCanChangeIndex(){
        ArrayOfOneAndZeros array = new ArrayOfOneAndZeros();
        int[] number ={4,5,8,8,8,2,9};
        assertArrayEquals(new int[]{0,1,0,0,0,0,1}, array.changeIndexElement(number));
    }






}