package com.ocp.day17_db.exception;

// 密碼比對失敗錯誤
public class PasswordNotMatchException extends LoginException {
    public PasswordNotMatchException(String msg) {
        super(msg);
    }
}
