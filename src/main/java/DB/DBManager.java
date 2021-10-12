package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
    private static DBManager instance = null;
    private Connection con = null;

    public static void main(String[] args) {
        DBManager.getConnection();
    }

    private static DBManager getInstance() {
        if(instance == null) {
            instance = new DBManager();
        }
        return instance;
    }

    private DBManager() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_shop", "root","1234" );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return getInstance().con;
    }
}
