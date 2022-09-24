package com.ocp.day16_login;

@FunctionalInterface
public interface LoginService {
    boolean login(String name, String password);
}
