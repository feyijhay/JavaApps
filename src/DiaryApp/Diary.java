package DiaryApp;

import java.util.ArrayList;


public class Diary {
private boolean isLocked = true;

private ArrayList<Entry> entries = new ArrayList<Entry>();

private String userName;
private String passWord;

private int generateId;



    public Diary(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }


    public boolean isLocked() {
        return isLocked;
    }

    public void unLocked() {
        isLocked = false;
    }

    public int generateId(){
       return entries.size();
    }
    public void createEntry(String title, String body) {
       Entry entry = new Entry(generateId(), title, body);
       entries.add(entry);
    }

    public ArrayList<Entry> getEntries(){
        return entries;

    }

    public Entry findEntryById(int id) {
        Entry entry = null;
        for (int check = 0; check < entries.size(); check++) {
            if (entries.get(check).getId() == id) {
              entry = entries.get(check) ;
            }

        }

        return entry;
    }


    public void deleteEntry(int id) {
        Entry entry = findEntryById(id);
        entries.remove(entry);

    }


}
