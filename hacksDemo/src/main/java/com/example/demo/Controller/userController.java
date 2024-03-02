package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.User;
import com.example.demo.Service.userService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    private userService UserService;

  
    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return UserService.createUser(user);
    }


    @GetMapping("/users")
    public List<User> getAllUsers() {
        return UserService.getAllUsers();
    }

 
    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return UserService.getUserById(id);
    }

  
    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        return UserService.updateUser(id, userDetails);
    }

   
    @DeleteMapping("/User")
    public String deleteAllUsers() {
        UserService.deleteAllUsers();
        return "All users have been deleted successfully.";
    }

    
    @DeleteMapping("/User/{id}")
    public void deleteUser(@PathVariable Long id) {
        UserService.deleteUser(id);
    }
}
