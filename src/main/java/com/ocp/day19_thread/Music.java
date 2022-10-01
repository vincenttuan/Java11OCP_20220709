package com.ocp.day19_thread;

public class Music extends Thread {

    @Override
    public void run() {
        while (true) {            
            System.out.println("音樂播放中...");
        }
    }
    
}
