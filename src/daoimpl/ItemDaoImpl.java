package daoimpl;

import com.mysql.cj.xdevapi.DbDoc;
import dao.ItemDao;
import entity.Item;
import entity.User;
import util.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {
    @Override
    public void add(Item item) {
        Connection conn=null;
        PreparedStatement ps=null;

        conn=DBUtils.getConnection();

        try {
            String sql="insert into item values (?,?,?,?,?,?,?,?,?,?,?)";
            ps=conn.prepareStatement(sql);

            ps.setString(1,item.getId());
            ps.setString(2,item.getName());
            ps.setString(3,item.getDetail());
            ps.setString(4,item.getLow_price());
            ps.setString(5,item.getImg());
            ps.setString(6,item.getBrief_intro());
            ps.setInt(7,item.getNum());
            ps.setString(8,item.getType());
            ps.setString(9,item.getVersion());
            ps.setString(10,item.getPrice());
            ps.setString(11,item.getColor());

            update(conn,ps);
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

        conn=DBUtils.getConnection();

        try {
            String sql="delete from item where id=?";
            ps=conn.prepareStatement(sql);

            ps.setString(1,id);

            update(conn,ps);
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }
    }

    @Override
    public List<Item> findBy(String id) {
        Connection conn=null;
        PreparedStatement ps=null;
        List<Item> list=new ArrayList<>();

        conn=DBUtils.getConnection();

        try {
            String sql="select * from item where id=?";
            ps=conn.prepareStatement(sql);

            ps.setString(1,id);

            list=query(conn,ps);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }
        return list;
    }

    @Override
    public List<Item> findAll() {
        Connection conn=null;
        PreparedStatement ps=null;
        List<Item> list=new ArrayList<>();

        conn=DBUtils.getConnection();

        try {
            String sql="select * from item";
            ps=conn.prepareStatement(sql);


            list=query(conn,ps);
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }
        return list;
    }

    public void update(Connection conn,PreparedStatement ps){
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

    public List<Item> query(Connection conn,PreparedStatement ps) throws SQLException {
        List<Item> list=new ArrayList<>();
        ResultSet rs=null;
        Item item=null;

        rs=ps.executeQuery();
        while (rs.next()){
            item=new Item();
            item.setId(rs.getString(1));
            item.setName(rs.getString(2));
            item.setDetail(rs.getString(3));
            item.setLow_price(rs.getString(4));
            item.setImg(rs.getString(5));
            item.setBrief_intro(rs.getString(6));
            item.setNum(rs.getInt(7));
            item.setType(rs.getString(8));
            item.setVersion(rs.getString(9));
            item.setPrice(rs.getString(10));
            item.setColor(rs.getString(11));

            list.add(item);
        }

        return list;
    }


}
