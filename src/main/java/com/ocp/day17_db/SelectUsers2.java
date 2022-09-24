package com.ocp.day17_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUsers2 {
    public static void main(String[] args) {
        // 連線到資料庫
        try {
            // 1. 利用 class.forName 建立 driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {
            System.out.printf("驅動程式建立失敗: %s\n", ex);
            return;
        }
        
        // 2. 設定資料庫連線資訊
        String dbUrl = "jdbc:derby://localhost:1527/sample"; // 資料庫連線位置
        String username = "app"; // derby sample 資料庫預設登入名稱 = app
        String password = "app"; // derby sample 資料庫預設登入密碼 = app
        String sql = "select name, password from users"; // users 資料表 sql 查詢語句
        
        // 3. 建立資料庫連線(Connection), 資料SQL敘述物件(Statement), 資料回傳物件(ResultSet)
        try(Connection conn = DriverManager.getConnection(dbUrl, username, password);
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
