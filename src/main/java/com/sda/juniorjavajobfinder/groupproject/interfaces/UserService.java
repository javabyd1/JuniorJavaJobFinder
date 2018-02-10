package com.sda.juniorjavajobfinder.groupproject.interfaces;

import com.sda.juniorjavajobfinder.groupproject.model.User;

public interface UserService {

    User findByEmail(String email);

    void saveUser(User user);
}