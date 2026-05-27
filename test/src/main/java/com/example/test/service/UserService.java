package com.example.test.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.mapper.UserMapper;
import com.example.test.model.User;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    public User createUser(User user) {
        userMapper.insertUser(user);
        return user;
    }

    public User updateUser(User user) {
        userMapper.updateUser(user);
        return user;
    }

    public boolean deleteUser(Long id) {
        return userMapper.deleteUser(id) > 0;
    }
}