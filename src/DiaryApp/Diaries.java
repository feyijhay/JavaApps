package DiaryApp;

import java.util.ArrayList;
import java.util.Objects;

public class Diaries {
    private ArrayList<Diary> diaries = new ArrayList<Diary>();

    public void addDiary(String passWord, String userName) {
        Diary diary = new Diary(userName, passWord);
        diaries.add(diary);
    }

    public Diary findByUsername(String userName) {
        Diary diary = null;
        for (Diary value : diaries) {
            if (Objects.equals(value.getUserName(), userName)) {
                diary = value;

            }
        }
        return diary;

    }


    public void delete(String passWord, String userName) {
        Diary diary = findByUsername(userName);
        diaries.remove(diary);

    }
}


