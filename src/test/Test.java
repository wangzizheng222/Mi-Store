package test;

import com.google.gson.Gson;
import daoimpl.UserDaoImpl;
import entity.Item;
import entity.User;
import service.ItemService;
import service.UserService;
import util.MyTrans;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        UserDaoImpl userDao=new UserDaoImpl();
        UserService userService=new UserService();

        User user=userService.findByName("wzz2");
        System.out.println(user.getMail());
        System.out.println(user.getId());


//        User user=new User();
//        user.setId("2");
//        user.setMi_id("2");
//        user.setName("wzz");
//        user.setMail("11");
//        user.setTel("12");
//        user.setPassword("111");
//
//        userDao.add(user);


    }
}
