package hello.controller;

import hello.model.Note;
import hello.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private final NoteService noteService;
    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public Note createNote(@RequestBody @Valid Note note){
        return noteService.add(note);
    }
    @PatchMapping
    public Note updateNote(@RequestBody @Valid Note note){

        return noteService.update(note);
    }
    @DeleteMapping
    public Note deleteNote(@RequestBody @Valid Note note){
        return noteService.delete(note);
    }
    @GetMapping("/findById")
    public Note getNoteById(String id){
        return noteService.getNoteById(id);
    }
    @GetMapping
    public List<Note> getNotes(){
        return noteService.getNotes();
    }
}
