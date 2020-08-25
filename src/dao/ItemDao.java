package dao;

import entity.Item;

import java.util.List;

public interface ItemDao {
    public void add(Item item);
    public void del(String id);
    public List<Item> findBy(String id);
    public List<Item> findAll();
}
