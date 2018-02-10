package com.sda.juniorjavajobfinder.groupproject.repository;

import com.sda.juniorjavajobfinder.groupproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    User findByEmail(String email);

    User findByName(String name);

    User findByLastName(String lastName);
}