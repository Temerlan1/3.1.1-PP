package com.example.crudAppBoot.service;

import com.example.crudAppBoot.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void removeUserById(long id);

    List<User> findAll();

    User findById(long id);

    void update(User user);
}
