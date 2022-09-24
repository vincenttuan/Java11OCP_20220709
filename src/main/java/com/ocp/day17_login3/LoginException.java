package com.ocp.day17_login3;

// 自訂 Login 例外類別
public class LoginException extends Exception {
    public LoginException(String msg) {
        super(msg);
    }
    
    public void printLoginErrorMessage() {
        System.out.printf("登入失敗: %s\n", getMessage());
    }
}
