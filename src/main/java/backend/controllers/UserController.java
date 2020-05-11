package backend.controllers;

import backend.entity.User;
import backend.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api")
@RestController
public class UserController {
    @Autowired
    private UserServiceImp userServiceImp;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userServiceImp.saveUser(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user){
        return userServiceImp.loginUser(user);
    }

    @GetMapping("/users/{userName}")
    public User login(@PathVariable String userName){
        return userServiceImp.findUserByUserName(userName);
    }


}
