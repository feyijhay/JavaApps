package DiaryApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiariesTest {

    @Test
    public void testThatDiaryCanBeAddedToTheDiaries(){
        Diaries myDiaries = new Diaries();
        myDiaries.addDiary("1234", "Jumoke");
        assertNotNull(myDiaries.findByUsername("Jumoke"));
    }


    @Test
    public void testThatDiaryCanBeFound() {
        Diaries myDiaries = new Diaries();
        myDiaries.addDiary("1234", "Jumoke");
        myDiaries.addDiary("1111", "Ola");
        assertEquals(0, myDiaries.findByUsername("Jumoke"));
    }


    @Test
    public void testThatDiaryCanDelete() {
        Diaries myDiaries = new Diaries();
        myDiaries.addDiary("1234", "Jumoke");
        myDiaries.addDiary("1111", "Ola");
        myDiaries.delete("1111", "ola" );
        assertEquals(1, myDiaries.findByUsername("Ola"));
    }


}
