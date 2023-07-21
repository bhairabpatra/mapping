package com.mapping.user.service;

import com.mapping.user.dao.UserDao;
import com.mapping.user.entiry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;
    @Override
    public User createUser(User user) {
        return userDao.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getCredential(Long id) {
        Optional<User> newUser  = userDao.findById(id);
        return newUser.get();
    }
}
