package hello.configmongo;

import hello.model.Note;
import hello.model.User;
import hello.repository.NoteRepository;
import hello.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories(basePackageClasses = {UserRepository.class, NoteRepository.class})
@Configuration
public class MongoConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository,NoteRepository noteRepository){
        return String ->{
            userRepository.deleteAll();
            noteRepository.deleteAll();
            User us1 = new User("Jhon");
            User us2 = new User("Juan");
            User us3 = new User("ana");
            User us4 = new User("Jose");
            Note n1 = new Note("jhgfds",us1);
            Note n2 = new Note("iuytre",us2);
            Note n3 = new Note("hdjksl",us3);
            Note n4 = new Note("utiroep",us4);
            userRepository.save(us1);
            userRepository.save(us2);
            userRepository.save(us3);
            userRepository.save(us4);
            noteRepository.save(n1);
            noteRepository.save(n2);
            noteRepository.save(n3);
            noteRepository.save(n4);


        };
    }
}
