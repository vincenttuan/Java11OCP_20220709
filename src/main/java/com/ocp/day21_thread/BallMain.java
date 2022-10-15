package com.ocp.day21_thread;

class Take implements Runnable {
    private Ball ball;
    public Take(Ball ball) {
        this.ball = ball;
    }
    @Override
    public void run() {
        ball.take(); // 拿球
    }
}

public class BallMain {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Thread t1 = new Thread(new Take(ball), "T1");
        t1.start();
    }
}
