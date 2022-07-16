package com.ocp.day02;

public class User {
    String name; // 使用者姓名  (又稱為物件變數, 欄位, 屬性) 預設值是 null
    double height; // 身高(cm) (又稱為物件變數, 欄位, 屬性) 預設值是 0.0
    double weight; // 體重(kg) (又稱為物件變數, 欄位, 屬性) 預設值是 0.0
    
    double getBMI() { // 取得 bmi 資料
        double bmi = weight / Math.pow(height/100, 2); // bmi (又稱為區域變數, 無預設值的配置)
        return bmi;
    }
}
