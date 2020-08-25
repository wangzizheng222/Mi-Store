package service;

import daoimpl.ItemDaoImpl;
import entity.Item;

import java.util.List;

public class ItemService {
    public List<Item> getAll(){
        List<Item> list;
        ItemDaoImpl itemDao=new ItemDaoImpl();

        list=itemDao.findAll();
        return list;
    }

    /**
     *
     * @param type 返回商品的类型
     * @return 返回该类商品的列表
     */
    public List<Item> getByType(String type){
        List<Item> list;
        ItemDaoImpl itemDao=new ItemDaoImpl();

        list=itemDao.findAll();

        list.removeIf(item -> !item.getType().equals(type));

        return list;
    }
}
