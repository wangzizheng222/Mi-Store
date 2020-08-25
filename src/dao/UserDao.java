package dao;

import entity.User;

import java.util.List;

public interface UserDao {
    public void add(User user);
    public void del(String id);
    public void update(User user,String id);
    public List<User> findBy(String value);
    public List<User> findAll();
}
