package com.fifth.pillar.usercrudms.services;

import com.fifth.pillar.usercrudms.models.User;
import com.fifth.pillar.usercrudms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
