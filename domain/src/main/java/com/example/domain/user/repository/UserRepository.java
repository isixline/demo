package com.example.domain.user.repository;

import com.example.domain.user.model.User;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<User> findAll() {
        return Collections.emptyList();
    }

    public User findById(String id) {
        return User.builder().id(id).name("anyName").build();
    }
}
