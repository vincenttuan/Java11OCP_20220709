package com.ocp.day16_login2;

@FunctionalInterface
public interface LoginService {
    // 驗證失敗會拋出一個例外物件, 此例外物件會有自訂的錯誤訊息
    boolean login(String name, String password) throws Exception;
}
