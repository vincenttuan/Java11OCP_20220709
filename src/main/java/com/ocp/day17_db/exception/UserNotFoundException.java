package com.ocp.day17_db.exception;

// 查無使用者錯誤
public class UserNotFoundException extends LoginException {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}
