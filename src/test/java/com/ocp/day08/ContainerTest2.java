package com.ocp.day08;

import java.util.Arrays;

public class ContainerTest2 {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(); // 寶特瓶
        Bowl bowl = new Bowl(); // 碗
        FoilPack foilPack = new FoilPack(); // 鋁箔包
        BigBottle bigBottle = new BigBottle(); // 重量級寶特瓶
        OilBottle oilBottle = new OilBottle(); // 油瓶
        
        // 所有容器
        Container[] containers = {bottle, bowl, foilPack, bigBottle, oilBottle};
        // 所有小容器
        AContainer[] aContainers = {bottle, bowl, foilPack};
        // 所有大容器
        BigAContainer[] bigAContainer = {bigBottle, oilBottle};
        
        // 印出所有容器的容量與名字
        for(Container container : containers) {
            System.out.printf("%dml ", container.capacity());
            container.printName();
        }
        // 印出所有容器的容量與名字 使用 Java 8 Stream
        Arrays.stream(containers).forEach(container -> {
            System.out.printf("%dml ", container.capacity());
            container.printName();
        });
        // 所有容器容量加總為何?
        int sum = 0;
        for(Container container : containers) {
            sum += container.capacity();
        }
        System.out.println(sum);
        // 所有容器容量加總為何? Java 8 Stream
        int sum2 = Arrays.stream(containers)
                         .mapToInt(container -> container.capacity())
                         .sum();
        System.out.println(sum2);
        
        // 在所有的容器中小容器的容量加總為何 = ?
        int sum3 = Arrays.stream(containers)
                         .filter(container -> container instanceof AContainer)
                         //.peek(container -> container.printName())
                         .mapToInt(container -> container.capacity())
                         //.peek(System.out::println) // 將每一個元素印出
                         .sum();  
        System.out.println(sum3);
    }
}
