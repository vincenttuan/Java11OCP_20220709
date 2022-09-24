package com.ocp.day16_login;

import java.util.Scanner;

public class LoginClient {
    LoginService loginService = new LoginServiceImpl();
    
    boolean login() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String password = scanner.next();
        boolean result = loginService.login(name, password);
        return result;
    }
    
    public static void main(String[] args) {
        LoginClient loginClient = new LoginClient();
        loginClient.login();
    }
}
