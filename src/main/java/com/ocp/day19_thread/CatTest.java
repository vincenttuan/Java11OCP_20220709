package com.ocp.day19_thread;

public class CatTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Music music = new Music();
        // 將 music 設定為背景執行緒
        music.setDaemon(true);
        //car1.driver();
        //car2.driver();
        // 設定執行緒名稱
        car1.setName("Toyota");
        car2.setName("BMW");
        // 設定權限 (1~10)
        car1.setPriority(Thread.MIN_PRIORITY); // 1
        car2.setPriority(Thread.MAX_PRIORITY); // 10
        // 啟動
        car1.start();
        car2.start();
        music.start();
    }
}
