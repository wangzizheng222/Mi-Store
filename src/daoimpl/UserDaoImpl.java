package daoimpl;

import dao.UserDao;
import entity.User;
import util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public void add(User user) {
        Connection conn=null;
        PreparedStatement ps=null;

        conn= DBUtils.getConnection();

        try {
            String sql="insert into user values (?,?,?,?,?,?)";
            ps=conn.prepareStatement(sql);

            ps.setString(1,user.getId());
            ps.setString(2,user.getMi_id());
            ps.setString(3,user.getTel());
            ps.setString(4,user.getMail());
            ps.setString(5,user.getPassword());
            ps.setString(6,user.getName());

            int res=ps.executeUpdate();
            if (res>0){
                System.out.println("done");
            }else {
                System.out.println("failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }
    }

    @Override
    public void del(String id) {
        Connection conn=null;
        PreparedStatement ps=null;

        conn= DBUtils.getConnection();

        try {
            String sql="delete from user where id=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,id);

            int res=ps.executeUpdate();
            if (res>0){
                System.out.println("done");
            }else {
                System.out.println("failed");
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }
    }

    @Override
    public void update(User user, String id) {
        Connection conn=null;
        PreparedStatement ps=null;

        conn= DBUtils.getConnection();

        try {
            String sql="update user set id=?,mi_id=?,tel=?,mail=?,password=?,name=? where id=?";
            ps=conn.prepareStatement(sql);

            ps.setString(1,user.getId());
            ps.setString(2,user.getMi_id());
            ps.setString(3,user.getTel());
            ps.setString(4,user.getMail());
            ps.setString(5,user.getPassword());
            ps.setString(6,user.getName());
            ps.setString(7,id);

            int res=ps.executeUpdate();
            if (res>0){
                System.out.println("done");
            }else {
                System.out.println("failed");
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }
    }

    @Override
    public List<User> findBy(String value) {
        List<User> list=new ArrayList<>();
        User user=null;
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement ps=null;

        conn=DBUtils.getConnection();
        try {
            String sql="select * from user where tel=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,value);

            rs=ps.executeQuery();
            while (rs.next()){
                user=new User(rs.getString(1),rs.getString(2),
                        rs.getString(3),rs.getString(4),
                        rs.getString(5),rs.getString(6));
                list.add(user);
            }

            if (list.size()==0){
                sql="select * from user where mi_id=?";
                ps=conn.prepareStatement(sql);
                ps.setString(1,value);

                rs=ps.executeQuery();
                while (rs.next()){
                    user=new User(rs.getString(1),rs.getString(2),
                            rs.getString(3),rs.getString(4),
                            rs.getString(5),rs.getString(6));
                    list.add(user);
                }
            }
            if (list.size()==0){
                sql="select * from user where mail=?";
                ps=conn.prepareStatement(sql);
                ps.setString(1,value);

                rs=ps.executeQuery();
                while (rs.next()){
                    user=new User(rs.getString(1),rs.getString(2),
                            rs.getString(3),rs.getString(4),
                            rs.getString(5),rs.getString(6));
                    list.add(user);
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }

        return list;
    }

    @Override
    public List<User> findAll() {
        List<User> list=new ArrayList<>();
        User user=null;
        ResultSet rs=null;
        Connection conn=null;
        PreparedStatement ps=null;

        conn=DBUtils.getConnection();

        try {
            String sql="select * from user";
            ps=conn.prepareStatement(sql);

            rs=ps.executeQuery();

            while (rs.next()){
                user=new User(rs.getString(1),rs.getString(2),
                        rs.getString(3),rs.getString(4),
                        rs.getString(5),rs.getString(6));
                list.add(user);
            }

        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }

        return list;
    }
}
