package com.ocp.day17_login3;

import com.ocp.day17_login3.exception.PasswordNotMatchException;
import com.ocp.day17_login3.exception.UserNotFoundException;
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
