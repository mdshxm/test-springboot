package com.example.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.test.entity.User;
import com.example.test.utils.Result;

import java.io.Serializable;

public interface UserService extends IService<User> {
    boolean login(User user);
    boolean addUser(User user);
    boolean deleteUser(String id);
    boolean updateUser(User user);
    User selectById(String id);
}
