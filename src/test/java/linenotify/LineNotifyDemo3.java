package linenotify;

import com.linenotify.service.LineService;

public class LineNotifyDemo3 {
    public static void main(String[] args) throws Exception {
        LineService lineService = new LineService();
        for(int i=1;i<=20;i++) {
            int respCode = lineService.sendText("大家好: " + i);
            System.out.printf("第 %d 筆 回應碼: %d\n", i, respCode);
        }
    }
}
