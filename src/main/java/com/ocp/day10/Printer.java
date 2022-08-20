package com.ocp.day10;

// 列表機
// 若介面中只有一個抽象方法(未實作的方法)
// 則該介面可以定義為 FunctionalInterface
// 任何 @FunctionalInterface 都可以透過 Lambda 語法來操作實現
@FunctionalInterface
public interface Printer {
    // 列印資料
    public void print(String data);
}
