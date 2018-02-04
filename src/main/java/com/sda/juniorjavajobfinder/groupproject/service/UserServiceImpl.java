package com.sda.juniorjavajobfinder.groupproject.service;

import com.sda.juniorjavajobfinder.groupproject.interfaces.UserService;
import com.sda.juniorjavajobfinder.groupproject.model.User;
import com.sda.juniorjavajobfinder.groupproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}