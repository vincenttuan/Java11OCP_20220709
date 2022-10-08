package linenotify;

// 撰寫一個 Line Notify 測試程式
public class LineNotifyDemo {
    public static void main(String[] args) throws Exception {
        // 1-1. 設定要發送的資料訊息
        String message = "Hello 雙十國慶日快樂";
        // 1-2. 將發送的文字轉 utf-8 byte[]
        byte[] postData = ("message=" + message).getBytes("UTF-8");
        // 2. 設定存取權杖(也稱為: token)
        String token = "你自己的 token";
        // 3. 設定 Line Notify 發送中心位置
        String lineNotifyUrl = "https://notify-api.line.me/api/notify";
        
    }
}
