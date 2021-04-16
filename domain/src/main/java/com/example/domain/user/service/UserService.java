package com.example.domain.user.service;

import com.example.domain.user.model.User;
import com.example.domain.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User getById(String id) {
        return repository.findById(id).get();
    }
}
