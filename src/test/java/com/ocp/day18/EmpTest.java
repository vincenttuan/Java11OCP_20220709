package com.ocp.day18;

import com.ocp.day18_assertion.Emp;

public class EmpTest {
    public static void main(String[] args) {
        Emp emp = new Emp("John", 60000);
        
        // 使用 emp 的資源 ...
        
        emp = null;
        
        System.gc(); // 建議啟動資源回收
        
        for(int i=0;i<=999999999;i++);
    }
}
