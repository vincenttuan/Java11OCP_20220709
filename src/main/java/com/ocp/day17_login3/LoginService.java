package com.ocp.day17_login3;

@FunctionalInterface
public interface LoginService {
    // 驗證失敗會拋出一個"自訂"例外物件, 此例外物件會有自訂的錯誤訊息
    boolean login(String name, String password) throws LoginException;
}
