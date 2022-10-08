package com.linenotify.service;

import java.util.concurrent.Callable;

public class LineCallable implements Callable<Integer> {
    private LineService lineService = new LineService();
    private String message;
    public LineCallable(String message) {
        this.message = message;
    }
    @Override
    public Integer call() throws Exception {
        return lineService.sendText(message);
    }
    
}
