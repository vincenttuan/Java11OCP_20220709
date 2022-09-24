package com.ocp.day17_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUsers3 {
    public static void main(String[] args) {
        // SQL 語句
        String sql = "select name, password from users"; // users 資料表 sql 查詢語句
        
        // 建立資料庫連線(Connection), 資料SQL敘述物件(Statement), 資料回傳物件(ResultSet)
        try(Connection conn = ConnUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            
            while (rs.next()) {                
                String name = rs.getString("name");
                String pwd = rs.getString("password");
                System.out.printf("%-5s %-5s\n", name, pwd);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }
}
