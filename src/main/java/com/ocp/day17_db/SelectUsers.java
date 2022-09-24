package com.ocp.day17_db;

// 查詢 users 資料表的內容

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SelectUsers {
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
        Connection conn = null;  // 資料庫連線
        Statement stmt = null;  // 資料SQL敘述物件
        ResultSet rs = null;  // 資料回傳物件
        
        try {
            conn = DriverManager.getConnection(dbUrl, username, password); // 建立連線
            System.out.println(!conn.isClosed());  // 是否已連線/關閉
            stmt = conn.createStatement(); // 建立資料SQL敘述物件
            rs = stmt.executeQuery(sql); // stmt 透過 sql 將查詢的資料結果給 rs
            // 顯示 rs 資料結果
            while (rs.next()) {
                String name = rs.getString("name"); // 取得 name 欄位資料結果
                String pwd = rs.getString("password"); // 取得 password 欄位資料結果
                System.out.printf("%-5s %-5s\n", name, pwd);
            }
        } catch (SQLException ex) {
            System.out.printf("連線失敗: %s\n", ex);
        } finally {
            if(rs != null) {
                try {
                    rs.close(); // 關閉 rs 物件
                } catch (SQLException ex) {
                    System.out.printf("rs 物件關閉失敗: %s\n", ex);
                }
            }
            if(stmt != null) {
                try {
                    stmt.close(); // 關閉敘述物件
                } catch (SQLException ex) {
                    System.out.printf("敘述物件關閉失敗: %s\n", ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close(); // 關閉連線
                } catch (SQLException ex) {
                    System.out.printf("連線關閉失敗: %s\n", ex);
                }
            }
            
            
        }
        
        
    }
}
