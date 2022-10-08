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
        
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
}

class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("瓦斯工人送瓦斯");
        System.out.println("瓦斯工人將瓦斯送到家");
        System.out.println("瓦斯工人將瓦斯裝設完畢");
    }
}

public class Shower {
    
}
