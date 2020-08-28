package dao;

import entity.Cart;

import java.util.List;

public interface CartDao {
    public void add(Cart cart);
    public void del(String userName);
    public List<Cart> findById(String userName);
    public List<Cart> findAll();
}
