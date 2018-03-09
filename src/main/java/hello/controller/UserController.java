package hello.controller;


import hello.model.User;
import hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody @Valid User user){
        return userService.add(user);
    }
    @PatchMapping
    public User updateUser(@RequestBody @Valid User user){
        return userService.update(user);
    }
    @DeleteMapping
    public User deleteUser(@RequestBody @Valid User user){
        return userService.delete(user);
    }
    @GetMapping("/findById")
    public User getUserById(@RequestParam("id") String id){
        return userService.getUserById(id);
    }
    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
