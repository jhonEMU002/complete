package hello.service;

import hello.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User getUserById(String id);
    User add(User user);
    User update(User user);
    User delete(User user);
    List<User> getUsers();
}
