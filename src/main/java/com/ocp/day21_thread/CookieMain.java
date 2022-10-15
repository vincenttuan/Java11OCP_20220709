package com.ocp.day21_thread;

public class CookieMain {
    public static void main(String[] args) {
        Cookie cookie = new Cookie(); // 餅乾資源
        Eat eat = new Eat(cookie); // 吃餅乾的工作
        Put put = new Put(cookie); // 放餅乾的工作
        // 建立二條執行緒
        Thread t1 = new Thread(eat, "小狗");
        Thread t2 = new Thread(put, "主人");
        /*---------------------------------------------
         * 劇本: 主人放第 1 塊餅乾, 小狗吃第 1 塊餅乾
         *      主人放第 2 塊餅乾, 小狗吃第 2 塊餅乾
         *      ...
         *      主人放第 10 塊餅乾, 小狗吃第 10 塊餅乾
        ---------------------------------------------*/
        t1.start();
        t2.start();
        
    }
}
