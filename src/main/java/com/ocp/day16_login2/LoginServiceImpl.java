package com.ocp.day16_login2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LoginServiceImpl implements LoginService {
    private static Map<String, String> users;
    static {
        users = new LinkedHashMap<>();
        users.put("John", "1234");
        users.put("Mary", "5678");
    }
    
    @Override
    public boolean login(String name, String password) throws Exception {
        // 1. 根據 name 來查看是否有此人 ?
        if(users.get(name) == null) { // 無此人
            // 建立一個例外
            Exception e1 = new Exception(name + " 尚未建立帳號!");
            throw e1; // 將例外訊息拋出
        }
        // 2. 判斷 password 是否一致?
        boolean result = users.get(name).equals(password);
        if(!result) { // password 不一致
            // 建立一個例外
            Exception e2 = new Exception(name + " 密碼錯誤");
            throw e2; // 將例外訊息拋出
        }
        return true; // 登入成功
    }
    
}
