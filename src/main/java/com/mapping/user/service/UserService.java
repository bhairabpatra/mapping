package com.mapping.user.service;

import com.mapping.user.entiry.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {

    public User createUser(User user);

    public List<User> getAllUser();

    public User getCredential(Long id);
}
