package service;

import daoimpl.CartDaoImpl;
import entity.Cart;

import java.util.List;

public class CartService {
    public List<Cart> getByName(String name){
        List<Cart> list;
        CartDaoImpl cartDao=new CartDaoImpl();

        list=cartDao.findById(name);
        return list;
    }

    public void addItem(String userName,String version,String color,String name
    ,int num, String itemId, String price){
        CartDaoImpl cartDao=new CartDaoImpl();
        Cart cart=new Cart();

        cart.setUserName(userName);
        cart.setName(name);
        cart.setItemId(itemId);
        cart.setColor(color);
        cart.setVersion(version);
        cart.setNum(num);
        cart.setPrice(price);

        cartDao.add(cart);
    }

    public void delById(int index,String userName){
        CartDaoImpl cartDao=new CartDaoImpl();
        List<Cart> list=cartDao.findById(userName);

        list.remove(index);

        cartDao.del(userName);
        for (Cart cart:list){
            cartDao.add(cart);
        }
    }
}
