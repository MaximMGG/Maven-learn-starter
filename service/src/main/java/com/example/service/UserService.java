package com.example.service;

import java.util.Optional;

import com.example.dto.UserDto;
import com.test.database.dao.UserDao;

public class UserService {

    private final UserDao userDao = new UserDao();


    public Optional<UserDto> getUser(Long id) {
       return userDao.findById(id)
                        .map(it -> new UserDto());
    }
    
}
