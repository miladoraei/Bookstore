import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn;
        try {
            conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testnew", "root" , "88130007");
            if (conn!=null)
            {
                System.out.println("Connected");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}