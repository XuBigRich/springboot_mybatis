package top.piao888.springboot.server;

import top.piao888.springboot.domain.User;

import java.util.List;

public interface UserServer {
    public List<User> getAll();
    public void delete(int id);
    public void insert(User user);
}
