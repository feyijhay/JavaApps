package DiaryAppTest;

import DiaryApp.Diary;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DiaryTest {

    @Test
    public void testThatDiaryIsCreated(){
        Diary myDiary = new Diary("Jumoke", "1234");
        myDiary.isLocked();
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryIsUnlocked(){
        Diary myDiary = new Diary("Jumoke", "1234");
        myDiary.unLocked();
        assertFalse(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryCanCreateEntry(){
        Diary myDiary = new Diary("Jumoke", "1234");
        myDiary.unLocked();
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        assertEquals(1, myDiary.getEntries().size());
        assertFalse(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryCanAddMultipleEntry(){
        Diary myDiary = new Diary("Jumoke", "1234");
        myDiary.unLocked();
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        assertEquals(3, myDiary.getEntries().size());
        assertFalse(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryCanFindEntry(){
        Diary myDiary = new Diary("Jumoke", "1234");
        myDiary.unLocked();
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        assertEquals(3, myDiary.getEntries().size());
        myDiary.findEntryById(2);
        assertFalse(myDiary.isLocked());
    }

//    @Test
//    public void testThatDiaryCanDeleteEntry(){
//        Diary myDiary = new Diary("Jumoke", "1234");
//        myDiary.unLocked();
//        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
//        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
//        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
//        assertEquals(3, myDiary. ().size());
//        myDiary.remove("Today's Diary", "Today is such a stressful day");
//        assertFalse(myDiary.isLocked());
//    }
}
