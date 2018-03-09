package hello.service;

import hello.model.Note;
import hello.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;
    @Autowired
    public NoteServiceImpl(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Note getNoteById(String id) {
        return noteRepository.findNoteById(id);
    }

    @Override
    public Note add(Note note) {
        note.setDate(LocalDateTime.now());
        return noteRepository.save(note);
    }

    @Override
    public Note update(Note note) {
       // note.setDate(LocalDateTime.now());
        return noteRepository.save(note);
    }

    @Override
    public Note delete(Note note) {
        noteRepository.delete(note);
        return null;
    }

    @Override
    public List<Note> getNotes() {
        return noteRepository.findAll();
    }
}
