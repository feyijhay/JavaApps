package DiaryApp;

import java.time.LocalDateTime;

public class Entry {
    private int id;

    private String title;

    private String body;

    private LocalDateTime dateCreated;

    public Entry(int id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getId(){
        return this.id ;
    }

    public void setTitle(String title){
        this.title = title;

    }

    public void setBody(String body){
        this.body = body;
    }

    public String getTitle(){
        return this.title;
    }

    public String getBody(){
        return this.body;
    }

}


