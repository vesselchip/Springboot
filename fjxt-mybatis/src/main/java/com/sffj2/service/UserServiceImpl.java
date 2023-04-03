package com.sffj2.service;

import com.sffj2.dao.UserDAO;
import com.sffj2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDao;

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
