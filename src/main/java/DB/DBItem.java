package DB;

import BO.Item;
import BO.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class DBItem {
    public static Collection<Item> getItems(String name){
        ArrayList<Item> items = new ArrayList<>();
        try{
            Connection con = DBManager.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from t_item where item_name like '%"+name+"%'");
            while(rs.next()){
                items.add(new Item (rs.getString(1),rs.getString(2),rs.getFloat(3),rs.getInt(4),rs.getInt(5)));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return items;
    }

    public static Item getItems(int id) {
       Item item = null;
        try{
            Connection con = DBManager.getConnection();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from t_item where id ='  " + id +"'");

            while(rs.next()){
                item = new Item (rs.getString(1),rs.getString(2),rs.getFloat(3),rs.getInt(4),rs.getInt(5));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return item;
    }
}


