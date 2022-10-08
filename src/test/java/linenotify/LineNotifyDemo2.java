package linenotify;

import com.linenotify.service.LineService;

public class LineNotifyDemo2 {
    public static void main(String[] args) throws Exception {
        LineService lineService = new LineService();
        int respCode = lineService.sendText("今天是雨天~~");
        System.out.println("回應碼: " + respCode);
    }
}
