package linenotify;

import com.linenotify.service.LineService;

public class LineNotifyDemo4 {
    static LineService lineService = new LineService();
    static int i;
    public static void main(String[] args) {
        for(i=1;i<=20;i++) {
            Runnable r = () -> {
                try {
                    int respCode = lineService.sendText("大家好: " + i);
                    System.out.printf("第 %d 筆 回應碼: %d\n", i, respCode);
                } catch (Exception e) {
                }
            };
            Thread t = new Thread(r);
            t.start();
        }
    }
}
