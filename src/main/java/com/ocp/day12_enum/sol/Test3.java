package com.ocp.day12_enum.sol;

enum Connection {
    
    Oracle("admin", "1234"), MySQL("root", "5678"), WebServer("user", "1111");
    
    private String username;
    private String password;

    Connection(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public void printStatus() {
        System.out.println("連線成功");
    }
    
}

public class Test3 {
    public static void main(String[] args) {
        Connection conn = Connection.MySQL;
        conn.printStatus();
    }
}
