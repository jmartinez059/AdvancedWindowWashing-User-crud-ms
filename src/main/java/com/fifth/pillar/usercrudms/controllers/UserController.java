package com.fifth.pillar.usercrudms.controllers;

import com.fifth.pillar.usercrudms.models.User;
import com.fifth.pillar.usercrudms.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RequestMapping("/users")
@CrossOrigin(origins = "*")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> userList = userService.getAllUsers();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @GetMapping("/testendpoint")
    public ResponseEntity<String> testEndpoint() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = null;
        HttpStatus httpStatus;
        try {
            user = userService.getUserById(id);
            httpStatus = HttpStatus.OK;
        } catch (NoSuchElementException e) {
            httpStatus = HttpStatus.NOT_FOUND;
        }
        return new ResponseEntity<>(user, httpStatus);
    }

    @PostMapping()
    public ResponseEntity<User> addUser(@RequestBody User newUser) {
        User storedUser = userService.addUser(newUser);
        return new ResponseEntity<>(storedUser, HttpStatus.OK);
    }
}
