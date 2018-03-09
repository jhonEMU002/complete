package hello.repository;
import java.util.List;

import hello.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String>{
    User findUserById(String id);
}
