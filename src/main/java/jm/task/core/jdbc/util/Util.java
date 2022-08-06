package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    // реализуйте настройку соеденения с БД
    public static String USER_NAME = "root";
    public static String PASSWORD = "mysql";
    public static String URL = "jdbc:mysql://localhost:3307/test_data_base";
    public static String DRIVER = "com.mysql.cj.jdbc.Driver";


    public static Connection getConnection() {

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER_NAME, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
