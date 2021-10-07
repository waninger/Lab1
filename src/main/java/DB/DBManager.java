package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager {
    private static DBManager instance = null;
    private Connection con = null;

    /////////////////////////
    public static void main(String[] args) {
        DBManager.getConnection();
    }
    ////////////////////////

    private static DBManager getInstance() {
        if(instance == null) {
            instance = new DBManager();
        }
        return instance;
    }

    private DBManager() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_shop", "root","KTH__root!" );
       /*     Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from t_item");

            while(rs.next()) {
                System.out.println(rs.getString("item_name"));
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return getInstance().con;
    }
}
