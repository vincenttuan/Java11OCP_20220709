package com.ocp.day02;

public class TestUser {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "John";
        user1.height = 170;
        user1.weight = 60;
        System.out.printf("name: %s, height: %.1f weight: %.1f bmi: %.2f\n",
                           user1.name, user1.height, user1.weight, user1.getBMI());
        
    }
}
