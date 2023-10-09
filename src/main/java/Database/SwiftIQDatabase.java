package Database;


import java.sql.*;
import java.time.*;
import java.time.format.*;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Tuesday June 2023
 * @Time: 11:46 PM
 */
public class SwiftIQDatabase {
    public SwiftIQDatabase(){
        super();
    }


    DatabaseConnection databaseConnection = new DatabaseConnection();

    // Methods here
    // Admin LoggingIn
    public ResultSet verifyAdminLogin(String email, String password) throws SQLException {
        PreparedStatement pst = null;
        pst = databaseConnection.connection.prepareStatement("select * from admin where email = ? and password = ?");
        pst.setString(1, email);
        pst.setString(2, password);

        ResultSet resultSet = pst.executeQuery();
        return resultSet;
    }
}
