package service;

import daoimpl.UserDaoImpl;
import entity.User;

import java.util.List;

public class UserService {
    /**
     *
     * @param name 输入的用户名，可以是邮箱、手机号码、小米ID
     * @param password 账户密码
     * @return NAME:成功登录 -2:未找到账户 -3:密码错误
     */
    public String sign_in(String name,String password){
        UserDaoImpl userDao=new UserDaoImpl();

        User user=null;
        try {
            user= userDao.findBy(name).get(0);
//            user=userDao.findAll().get(0);
        }catch (Exception e){
            e.printStackTrace();
            return "-2";
        }


        if (user.getPassword().equals(password)){
            return user.getName();
        }
        else {
            return "-3";
        }


    }


    /**
     *
     * @param name
     * @param tel
     * @param mail
     * @param password
     * @return NAME:成功注册 NULL:未知原因 —1：已存在用户名
     */
    public String sign_up(String name, String tel, String mail, String password){
        UserDaoImpl userDao=new UserDaoImpl();

        User user=new User();

        String mi_id=String.valueOf(userDao.findAll().size()+1);

        user.setMi_id(mi_id);
        user.setId(mi_id);
        user.setName(name);
        user.setTel(tel);
        user.setMail(mail);
        user.setPassword(password);

        // 检验是否存在相关的用户名
        List<User> list=userDao.findAll();
        for (User user_item:list){
            if (user_item.getName().equals(name)){
                return "-1";
            }
        }

        try {
            userDao.add(user);
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }



        return name;
    }

    public User findByName(String name){
        User user=null;
        String id=null;
        UserDaoImpl userDao=new UserDaoImpl();

        List<User> list=userDao.findAll();

        list.removeIf(item -> !item.getName().equals(name));


        return list.get(0);
    }
}
