package DiaryAppTest;

import DiaryApp.Diary;
import DiaryApp.Entry;
import DiaryApp.IncorrectPasswordException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DiaryTest {

    @Test
    public void testThatDiaryIsCreated(){
        Diary myDiary = new Diary("Jumoke", "1234");
        myDiary.isLocked();
        assertFalse(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryIsUnlocked(){
        Diary myDiary = new Diary("Jumoke", "1234");
        myDiary.unLocked("1234");
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryCanCreateEntry(){
        Diary myDiary = new Diary("Jumoke", "1234");
        myDiary.unLocked("1234");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        assertEquals(1, myDiary.getEntries().size());
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryCanAddMultipleEntry(){
        Diary myDiary = new Diary("Jumoke", "1234");
        myDiary.unLocked("1234");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        assertEquals(3, myDiary.getEntries().size());
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryCanFindEntry(){
        Diary myDiary = new Diary("Jumoke", "1234");
        myDiary.unLocked("1234");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        assertEquals(3, myDiary.getEntries().size());
        myDiary.findEntryById(2);
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryCanDeleteEntry(){
        Diary myDiary = new Diary("Jumoke", "1234");
        myDiary.unLocked("1234");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        assertEquals(3, myDiary.getEntries().size());
        myDiary.deleteEntry(1);
        assertEquals(2, myDiary.getEntries().size());
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void testThatDiaryCanUpdateEntry(){
        Diary myDiary = new Diary("Jumoke", "1234");
        myDiary.unLocked("1234");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        myDiary.createEntry("Today's Diary", "Today is such a stressful day");
        assertEquals(3, myDiary.getEntries().size());
        myDiary.updateEntry(2, "Today is Monday", "I hate Mondays!!!");
        Entry entry = myDiary.findEntryById(2);
        assertEquals("Today is Monday", entry.getTitle());
        assertEquals("I hate Mondays!!!", entry.getBody());
        assertTrue(myDiary.isLocked());
    }

    @Test
    public void testThatWhenYouUnlockDiaryWithIncorrectPassword_ThrowsAnException(){
        Diary myDiary = new Diary("Jumoke", "1234");
        assertThrows(IncorrectPasswordException.class,()-> myDiary.unLocked("1324"));

    }

    @Test
    public void testThatWhenYouCreateDiaryWithNullUsername_ThrowsAnException(){
        assertThrows(IllegalArgumentException.class,()-> new Diary(null, "1234"));

    }

    @Test
    public void testThatWhenYouCreateDiaryWithoutUsername_ThrowsAnException(){
        assertThrows(IllegalArgumentException.class,()-> new Diary("", "1234"));

    }

    @Test
    public void testThatWhenYouCreateDiaryWithNullPassword_ThrowsAnException(){
        assertThrows(IllegalArgumentException.class,()-> new Diary("Jumoke", null));

    }

    @Test
    public void testThatWhenYouCreateDiaryWithoutPassword_ThrowsAnException(){
        assertThrows(IllegalArgumentException.class,()-> new Diary("Jumoke", ""));

    }
}
