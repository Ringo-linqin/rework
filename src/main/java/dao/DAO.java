package dao;

import java.sql.*;
/**
 * @author swh
 */
public class DAO {

    protected static Connection getConn() {
        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String dbURL = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=rework";// 数据库名master
        String userName = "sa";
        String userPwd = "123456";

        try {
            Class.forName(driverName);
            System.out.println("加载驱动成功！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("加载驱动失败！");
            return null;
        }
        try {
            Connection conn = DriverManager.getConnection(dbURL, userName, userPwd);
            System.out.println("连接数据库成功！");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("SQL Server连接失败！");
            return null;
        }

    }
}
