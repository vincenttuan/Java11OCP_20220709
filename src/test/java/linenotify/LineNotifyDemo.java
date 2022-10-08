package linenotify;

// 撰寫一個 Line Notify 測試程式

import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class LineNotifyDemo {
    public static void main(String[] args) throws Exception {
        // 1-1. 設定要發送的資料訊息
        String message = "Hello 雙十國慶日快樂";
        // 1-2. 將發送的文字轉 utf-8 byte[]
        byte[] postData = ("message=" + message).getBytes("UTF-8");
        // 2. 設定存取權杖(也稱為: token)
        String token = "LuH8r7TilC8hc4N1kADO7aFbV93y8uR4E77J5VxJD1m";
        // 3. 設定 Line Notify 發送中心位置
        String lineNotifyUrl = "https://notify-api.line.me/api/notify";
        //----------------------------------------------------------------
        // 4. 建立 URL 物件準備發送
        URL url = new URL(lineNotifyUrl);
        // 5. 建立/設定 Http 連線物件
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Bearer " + token);
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); // 可以不用加
        conn.setUseCaches(false);
        // 6. 訊息發送
        try(DataOutputStream dos = new DataOutputStream(conn.getOutputStream())) {
            dos.write(postData); // 將資料寫入網路串流中
            dos.flush(); // 提交更新
        }
        // 7. 取得回應碼
        System.out.println("回應碼: " + conn.getResponseCode());
        
    }
}
