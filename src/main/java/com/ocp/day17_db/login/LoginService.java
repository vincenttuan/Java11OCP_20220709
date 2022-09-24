package com.ocp.day17_db.login;

import com.ocp.day17_db.exception.PasswordNotMatchException;
import com.ocp.day17_db.exception.UserNotFoundException;

@FunctionalInterface
public interface LoginService {
    // 驗證失敗會拋出一個"自訂"例外物件, 此例外物件會有自訂的錯誤訊息
    boolean login(String name, String password) throws UserNotFoundException, PasswordNotMatchException;
}
