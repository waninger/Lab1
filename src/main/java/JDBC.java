import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] arg) {

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/web_shop", "root","Husmus87!" );
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from t_item");

            while(rs.next()) {
                System.out.println(rs.getString("item_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
