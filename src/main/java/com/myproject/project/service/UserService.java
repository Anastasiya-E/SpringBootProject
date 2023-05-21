package com.myproject.project.service;

import com.myproject.project.dao.UserDao;
import com.myproject.project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public User findById(Long id) {

        return userDao.getOne(id);
    }
    @Transactional
    public List<User> findAll() {

        return userDao.findAll();
    }
    @Transactional
    public User saveUser(User user) {

        return userDao.save(user);
    }
    @Transactional
    public void deleteById(Long id) {

        userDao.deleteById(id);
    }
}
