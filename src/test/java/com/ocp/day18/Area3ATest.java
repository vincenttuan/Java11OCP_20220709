package com.ocp.day18;

import com.ocp.day18_assertion.Area;
import org.junit.Test;
import org.junit.Assert;

// 進行標準 3A 測試
// 3A: 安排、行動、斷言
// 3A: Arrange, Act, Assert
public class Area3ATest {
    @Test
    public void test() {
        // 1: Arrange 安排測試物件與期望的結果
        Area area = new Area();
        int w = 10; // 底(測試參數)
        int h = 5; // 高(測試參數)
        int excepted = 25; // 期望得到的結果
        
        // 2: Act 調用目標物的方法並得到真實結果
        int actual = area.triangle(w, h); // 得到實際的值
        
        // 3. Assert 驗證測試結果
        Assert.assertEquals(actual, excepted); // 實際的值 == 期望的值 ?
    }
}
