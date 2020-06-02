package top.piao888.springboot.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.piao888.springboot.domain.User;
import top.piao888.springboot.mapper.UserMapper;
import top.piao888.springboot.server.UserServer;

import java.util.List;

@Service
public class UserServerimpl implements UserServer {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public void delete(int id) {
        userMapper.delete(id);
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}
