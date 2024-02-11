package MyArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    @Test
    public void testThatArrayListIsEmpty() {
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());

    }

    @Test
    public void testThatArrayListIsNotEmpty() {
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(10);
        assertFalse(myArrayList.isEmpty());

    }

    @Test
    public void testThatArrayListCanAdd2Element() {
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(10);
        myArrayList.add(15);
        assertFalse(myArrayList.isEmpty());
    }


    @Test
    public void testThatArrayListCanAdd1ElementAndRemove() {
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(10);
        myArrayList.remove(10);
        assertFalse(myArrayList.isEmpty());
    }


    @Test
    public void testThatArrayListCanAdd2ElementAnd1Remove() {
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(10);
        myArrayList.add(15);
        myArrayList.remove(10);
        assertFalse(myArrayList.isEmpty());
    }


    @Test
    public void testThatEmptyArrayListCanRemove() {
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
        myArrayList.remove(10);
        assertTrue(myArrayList.isEmpty());
    }


    @Test
    public void testThatArrayListCanGetElement() {
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(10);
        myArrayList.add(15);
        assertEquals(10, myArrayList.get(0));
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void testThatArrayListCanAdd3ElementGet3Element() {
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(10);
        myArrayList.add(15);
        myArrayList.add(12);

        assertEquals(10, myArrayList.get(0));
        assertEquals(15, myArrayList.get(1));
        assertEquals(12, myArrayList.get(2));
        assertFalse(myArrayList.isEmpty());
    }


    @Test
    public void testThatArrayListCanAdd3ElementAndGetTheSize(){
        MyArrayList myArrayList = new MyArrayList();
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(10);
        myArrayList.add(15);
        myArrayList.add(12);
        assertEquals(3, myArrayList.size());
        assertFalse(myArrayList.isEmpty());
    }



}

