package com.example.test.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.test.entity.User;
import com.example.test.mapper.UserMapper;
import com.example.test.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public boolean login(User user) {
        User u = this.getOne(new QueryWrapper<User>().eq("name", user.getName()).eq("password", user.getPassword()));
        return u != null ? true : false;
    }
    public boolean addUser(User user){
        return this.save(user);
    };
    public boolean deleteUser(String id){

        return this.removeById(id);
    };
    public boolean updateUser(User user){

        return this.updateById(user);
    };

    public User selectById(String id){
        return this.getById(id);
    }

}
