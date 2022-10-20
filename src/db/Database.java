package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static Database dbConnection=null;
    public Connection connection;

    private Database() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/salsaburger","root","1234");

    }
    public static Database getInstance() throws SQLException, ClassNotFoundException {
        return (dbConnection==null)? dbConnection=new Database():dbConnection;
    }
    public Connection getConnection(){
        return connection;
    }

}
