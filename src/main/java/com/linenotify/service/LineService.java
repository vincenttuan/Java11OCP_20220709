package com.linenotify.service;

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class LineService {
    // token
    private final String token = "你自己的 token";
    // line notify url
    private final String lineNotifyUrl = "https://notify-api.line.me/api/notify";
    // 傳送訊息
    public int sendText(String message) throws Exception {
        byte[] postData = ("message=" + message).getBytes("UTF-8");
        URL url = new URL(lineNotifyUrl);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Bearer " + token);
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setUseCaches(false);
        try(DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
            dos.write(postData); // 將資料寫入網路串流中
            dos.flush(); // 提交更新
        }
        return conn.getResponseCode();
    }
}
