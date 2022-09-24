package com.ocp.day17_login3.exception;

// 密碼比對失敗錯誤
public class PasswordNotMatchException extends LoginException {
    public PasswordNotMatchException(String msg) {
        super(msg);
    }
}
