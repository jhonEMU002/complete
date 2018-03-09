package hello.repository;

import hello.model.Note;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note,String>{
    Note findNoteById(String id);
}
