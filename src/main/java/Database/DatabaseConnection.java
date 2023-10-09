package Database;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday June 2023
 * @Time: 11:46 PM
 */
import java.sql.*;

public class DatabaseConnection {
    public static Connection establish(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc,Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/swiftiq", "root", "");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}

