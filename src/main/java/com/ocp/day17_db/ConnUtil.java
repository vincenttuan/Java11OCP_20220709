package com.ocp.day17_db;

// 連線工具

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtil {
    
    public static Connection getConnection() throws SQLException {
        // 連線到資料庫
        try {
            // 1. 利用 class.forName 建立 driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (ClassNotFoundException ex) {
            System.out.printf("驅動程式建立失敗: %s\n", ex);
            SQLException e = new SQLException("驅動程式建立失敗");
            throw e;
        }
        
        // 2. 設定資料庫連線資訊
        String dbUrl = "jdbc:derby://localhost:1527/sample"; // 資料庫連線位置
        String username = "app"; // derby sample 資料庫預設登入名稱 = app
        String password = "app"; // derby sample 資料庫預設登入密碼 = app
        
        return DriverManager.getConnection(dbUrl, username, password);
    }
    
}
