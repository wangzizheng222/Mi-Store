package daoimpl;

import dao.CartDao;
import entity.Cart;
import entity.Item;
import util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CartDaoImpl implements CartDao {
    @Override
    public void add(Cart cart) {
        Connection conn=null;
        PreparedStatement ps=null;

        conn=DBUtils.getConnection();

        try {
            String sql="insert into cart values (?,?,?,?,?,?,?,?)";
            ps=conn.prepareStatement(sql);

            ps.setString(1,cart.getUserName());
            ps.setString(2,cart.getVersion());
            ps.setString(3,cart.getColor());
            ps.setString(4,cart.getName());
            ps.setInt(5,cart.getNum());
            ps.setString(6,cart.getItemId());
            ps.setString(7,cart.getPrice());
            ps.setString(8,cart.getStatus());

            update(conn,ps);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }
    }

    @Override
    public void del(String userName) {
        Connection conn=null;
        PreparedStatement ps=null;

        conn=DBUtils.getConnection();

        try {
            String sql="delete from cart where user_name=?";
            ps=conn.prepareStatement(sql);

            ps.setString(1,userName);

            update(conn,ps);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }
    }

    @Override
    public List<Cart> findById(String userName) {
        Connection conn=null;
        PreparedStatement ps=null;
        List<Cart> list=new ArrayList<>();

        conn=DBUtils.getConnection();

        try {
            String sql="select * from cart where user_name=?";
            ps=conn.prepareStatement(sql);

            ps.setString(1,userName);

            list=query(conn,ps);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }

        return list;
    }

    @Override
    public List<Cart> findAll() {
        Connection conn=null;
        PreparedStatement ps=null;
        List<Cart> list=new ArrayList<>();

        conn=DBUtils.getConnection();

        try {
            String sql="select * from cart";
            ps=conn.prepareStatement(sql);

            list=query(conn,ps);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }

        return list;
    }

    public void update(Connection conn, PreparedStatement ps){
        try {
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

    public List<Cart> query(Connection conn, PreparedStatement ps) throws SQLException {
        List<Cart> list=new ArrayList<>();
        ResultSet rs=null;
        Cart cart=null;

        rs=ps.executeQuery();
        while (rs.next()){
            cart=new Cart();
            cart.setUserName(rs.getString(1));
            cart.setVersion(rs.getString(2));
            cart.setColor(rs.getString(3));
            cart.setName(rs.getString(4));
            cart.setNum(rs.getInt(5));
            cart.setItemId(rs.getString(6));
            cart.setPrice(rs.getString(7));
            cart.setStatus(rs.getString(8));

            list.add(cart);
        }

        return list;
    }
}
