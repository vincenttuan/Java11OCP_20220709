package com.ocp.day17_db;

// 查詢 users 資料表的內容

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
        String dbUrl = "jdbc:derby://localhost:1527/sample";
        String username = "app"; // derby sample 資料庫預設登入名稱 = app
        String password = "app"; // derby sample 資料庫預設登入密碼 = app
        String sql = "select name, password from users"; // users 資料表 sql 查詢語句
        
    }
}
