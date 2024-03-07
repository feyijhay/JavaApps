import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

   @Test
    public void testThatStackIsEmpty(){
       MyStack myStack = new MyStack(5);
       assertTrue(myStack.isEmpty());

    }

    @Test
    public void testThatStackIsNotEmpty(){
        MyStack myStack = new MyStack(3);
         myStack.push(4);
        assertFalse(myStack.isEmpty());

    }

//    @Test
//    public void (){
//        MyStack myStack = new MyStack(3);
//        myStack.push(4);
//        assertFalse(myStack.isEmpty());
//
//    }

}
