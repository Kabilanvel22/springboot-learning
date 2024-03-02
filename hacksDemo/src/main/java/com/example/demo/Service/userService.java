package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.userRepository;

import java.util.List;
import java.util.Optional;

@Service
public class userService {
    @Autowired
    private userRepository UserRepository;

    // Create a new user
    public User createUser(User user) {
        return UserRepository.save(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return UserRepository.findAll();
    }

    // Get user by ID
    public Optional<User> getUserById(Long id) {
        return UserRepository.findById(id);
    }

   
    public User updateUser(Long id, User userDetails) {
        Optional<User> user = UserRepository.findById(id);
        if (user.isPresent()) {
            User existingUser = user.get();
            existingUser.setName(userDetails.getName());
            existingUser.setEmail(userDetails.getEmail());
            return UserRepository.save(existingUser);
        }
        return null;
    }


    public void deleteAllUsers() {
        UserRepository.deleteAll();
    }

    public void deleteUser(Long id) {
        UserRepository.deleteById(id);
    }

}
