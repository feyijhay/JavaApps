package DiaryApp;

import java.util.ArrayList;


public class Diary {
private boolean isLocked = false;

private ArrayList<Entry> entries = new ArrayList<Entry>();

private String userName;
private String passWord;

private int generateId;



    public Diary(String userName, String passWord) {

        if (userName == null || userName.isEmpty()){
            throw new IllegalArgumentException("Enter username");
        }
        if (passWord == null || passWord.isEmpty()){
            throw new IllegalArgumentException("Password should not be left empty");
        }
        this.userName = userName;
        this.passWord = passWord;
    }


    public boolean isLocked() {
        return isLocked;
    }

    public void unLocked(String passWord) {
        if(!this.passWord.equals(passWord)){
            throw new IncorrectPasswordException("Enter correct password!");
        }
        isLocked = true;

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
        for (Entry value : entries) {
            if (value.getId() == id) {
                entry = value;
            }

        }

        return entry;
    }


    public void deleteEntry(int id) {
        Entry entry = findEntryById(id);
        entries.remove(entry);

    }


    public void updateEntry(int id, String title, String body) {
        Entry entry = findEntryById(id);
        entry.setTitle(title);
        entry.setBody(body);
    }

    public String getUserName(){
        return userName;
    }
}
