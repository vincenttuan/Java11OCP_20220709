package com.ocp.day17_db.login;

import com.ocp.day17_db.ConnUtil;
import com.ocp.day17_db.exception.PasswordNotMatchException;
import com.ocp.day17_db.exception.UserNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.Map;

public class LoginServiceImpl implements LoginService {
    private static Map<String, String> users;
    static {
        users = new LinkedHashMap<>();
        // 取得 derby users 資訊表內容 
        // SQL 語句
        String sql = "select name, password from users"; // users 資料表 sql 查詢語句
        // 建立資料庫連線(Connection), 資料SQL敘述物件(Statement), 資料回傳物件(ResultSet)
        try(Connection conn = ConnUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {                
                String name = rs.getString("name");
                String pwd = rs.getString("password");
                // 加入到 users 集合中
                users.put(name, pwd);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    @Override
    public boolean login(String name, String password) throws UserNotFoundException, PasswordNotMatchException {
        // 1. 根據 name 來查看是否有此人 ?
        if(users.get(name) == null) { // 無此人
            // 建立一個例外
            UserNotFoundException e1 = new UserNotFoundException(name + " 尚未建立帳號!");
            throw e1; // 將例外訊息拋出
        }
        // 2. 判斷 password 是否一致?
        boolean result = users.get(name).equals(password);
        if(!result) { // password 不一致
            // 建立一個例外
            PasswordNotMatchException e2 = new PasswordNotMatchException(name + " 密碼錯誤");
            throw e2; // 將例外訊息拋出
        }
        return true; // 登入成功
    }
    
}
