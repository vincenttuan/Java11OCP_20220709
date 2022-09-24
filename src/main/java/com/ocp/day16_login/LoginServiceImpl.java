package com.ocp.day16_login;

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
    public boolean login(String name, String password) {
        String currentPassword = users.get(name);
        if(currentPassword == null) {
            return false;
        }
        boolean result = currentPassword.equals(password);
        return result;
    }
    
}
