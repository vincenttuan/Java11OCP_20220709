package com.ocp.day07;
class Foo {
    void aaa() {System.out.println("甲");}
    void bbb() {System.out.println("乙");}
}
class Bar extends Foo {
    void aaa() {System.out.println("丙");}
    void ccc() {System.out.println("戊");}
}
class Fun extends Foo {
    void bbb() {System.out.println("丁");}
    void ddd() {System.out.println("己");}
}

// 多型測試
public class PolyTest {
    public static void main(String[] args) {
        Foo f1 = new Bar();
        f1.aaa();
        f1.bbb();
        //f1.ccc(); // 無法調用 ccc()
        ((Bar)f1).ccc();
        //((Fun)f1).ddd(); // 編譯可以成功但執行失敗
        if(f1 instanceof Fun) { // 判斷是否可以轉型?
            ((Fun)f1).ddd();
        } else {
            System.out.println("不可轉型");
        }
    }
}
