package hello.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document(collection = "notes")
public class Note {
    @Id
    private String id;

    private String text;
    private LocalDateTime date;

    private User user;

    public Note(){
        super();
    }
    public Note(String text, LocalDateTime date, User user){
        this.text = text;
        this.date = date;
        this.user = user;
    }
    public Note(String text, User user){
        this(text,LocalDateTime.now(),user);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
