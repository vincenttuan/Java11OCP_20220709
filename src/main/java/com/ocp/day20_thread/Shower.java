package com.ocp.day20_thread;

class Father extends Thread {
    @Override
    public void run() {
        System.out.println("爸爸下班回家");
        System.out.println("爸爸準備洗澡");
        System.out.println("爸爸發現沒瓦斯");
        System.out.println("爸爸打電話請瓦斯工人送瓦斯...");
        
        Worker worker = new Worker();
        worker.start(); // 啟動 worker 執行緒
        
        try {
            worker.join(1000); // worker 的工作做完之後, 才會繼續往下做
                               // 可以設定最大等待時間: 1000(ms) 表示 1秒 
        } catch (InterruptedException e) {
            System.out.println("執行緒發生中斷: " + e);
        }
        
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
}

class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("----------------------------------");
        System.out.println("瓦斯工人送瓦斯");
        System.out.println("瓦斯工人將瓦斯送到家");
        System.out.println("瓦斯工人將瓦斯裝設完畢");
        System.out.println("----------------------------------");
    }
}

public class Shower {
    public static void main(String[] args) {
        Father father = new Father();
        father.start();
    }
}
