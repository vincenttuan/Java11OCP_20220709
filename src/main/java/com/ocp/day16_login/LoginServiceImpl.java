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
        boolean result = users.get(name).equals(password);
        return result;
    }
    
}
