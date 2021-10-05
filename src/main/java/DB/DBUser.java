package DB;
import BO.User;

import java.sql.*;

public class DBUser {
    public static User getUser(String username, String password){
        try{
            Connection con = DBManager.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from t_user where name ="+username +"and where password ="+password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        //bygg user
        return user;

    }
}
