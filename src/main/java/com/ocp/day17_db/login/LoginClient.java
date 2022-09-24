package com.ocp.day17_db.login;

import com.ocp.day17_db.exception.LoginException;
import com.ocp.day17_db.exception.PasswordNotMatchException;
import com.ocp.day17_db.exception.UserNotFoundException;
import java.util.Scanner;

public class LoginClient {
    LoginService loginService = new LoginServiceImpl();
    
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入使用者名稱: ");
        String name = scanner.next();
        System.out.print("請輸入使用者密碼: ");
        String password = scanner.next();
        boolean result = false;
        try {
            result = loginService.login(name, password);
        } catch (UserNotFoundException | PasswordNotMatchException e) { // 透過 | 來統一捕捉例外, 限制: 例外間不可有繼承關係
            // 調用 LoginException 的自定方法
            e.printLoginErrorMessage();
        }
        return result;
    }
    
    public static void main(String[] args) {
        LoginClient loginClient = new LoginClient();
        boolean result = loginClient.login();
        System.out.println(result);
    }
}
