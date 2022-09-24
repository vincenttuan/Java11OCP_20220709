package com.ocp.day16_login;

import java.util.Scanner;

public class LoginClient {
    LoginService loginService = new LoginServiceImpl();
    
    boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入使用者名稱: ");
        String name = scanner.next();
        System.out.print("請輸入使用者密碼: ");
        String password = scanner.next();
        boolean result = loginService.login(name, password);
        return result;
    }
    
    public static void main(String[] args) {
        LoginClient loginClient = new LoginClient();
        boolean result = loginClient.login();
        System.out.println(result);
    }
}
