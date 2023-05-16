package com.test.springmvc.user.dao;

import com.test.springmvc.user.model.User;

import java.util.List;

public interface UserDao {

    User findById(Integer id);

    List<User> findAll();

    void save(User user);

    void update(User user);

    void delete(Integer id);

}
