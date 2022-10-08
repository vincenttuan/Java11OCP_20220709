package com.linenotify.service;

import java.util.concurrent.Callable;

public class LineCallable implements Callable<Integer> {
    private LineService lineService = new LineService();
    private String message;
    private String token;
    public LineCallable(String message, String token) {
        this.message = message;
        this.token = token;
    }
    @Override
    public Integer call() throws Exception {
        return lineService.sendText(message, token);
    }
    
}
