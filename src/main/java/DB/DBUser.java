package DB;
import BO.User;

import java.sql.*;

public class DBUser{
    public static User getUser(String username, String password){
        User u = null;
        try{

            Connection con = DBManager.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM t_user where username = '"+ username+"'"+"and password = '" +password +"'");

            if(rs.next()){
                u = new User(rs.getString(1),rs.getString(2),rs.getInt(3));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return u;

    }
}
