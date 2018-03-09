package hello.service;

import hello.model.Note;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoteService {
    Note getNoteById(String id);
    Note add(Note note);
    Note update (Note note);
    Note delete (Note note);
    List<Note> getNotes();
}
