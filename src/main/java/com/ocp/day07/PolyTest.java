package com.ocp.day07;
class Foo {
    int x = 100;
    void aaa() {System.out.println("甲");}
    void bbb() {System.out.println("乙");}
}
class Bar extends Foo {
    int x = 200;
    void aaa() {System.out.println("丙" + x);}
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
        System.out.println(f1.x); // 直接取用 Foo 物件的 x 值
        System.out.println(((Bar)f1).x);
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
