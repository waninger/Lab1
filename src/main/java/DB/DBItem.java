package DB;

import BO.Item;

import java.sql.*;
import java.util.Collection;

public class DBItem {
    public static Collection<Item> getItems(String name){
        try{
            Connection con = DBManager.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from t_item where name ="+name);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}


