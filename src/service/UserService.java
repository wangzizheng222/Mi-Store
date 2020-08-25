package service;

import daoimpl.UserDaoImpl;
import entity.User;

import java.util.List;

public class UserService {
    /**
     *
     * @param name 输入的用户名，可以是邮箱、手机号码、小米ID
     * @param password 账户密码
     * @return 1:成功登录 2:未找到账户 3:密码错误
     */
    public int sign_in(String name,String password){
        UserDaoImpl userDao=new UserDaoImpl();

        User user=null;
        try {
            user= userDao.findBy(name).get(0);
//            user=userDao.findAll().get(0);
        }catch (Exception e){
            e.printStackTrace();
            return 2;
        }


        if (user.getPassword().equals(password)){
            return 1;
        }
        else {
            return 3;
        }


    }
}
