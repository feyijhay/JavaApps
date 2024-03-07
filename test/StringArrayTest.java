import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringArrayTest  {
    @Test
    public void testThatArrayCanReturnTrueAndFalse(){
        StringArray myStringArray = new StringArray();
        int[] num = {4,5,8,8,8,2,9};
        boolean[] answer ={false,true, false, false, false, false, true};
        assertArrayEquals(new boolean[]{false,true, false, false, false, false, true}, myStringArray.array(num));
    }



}