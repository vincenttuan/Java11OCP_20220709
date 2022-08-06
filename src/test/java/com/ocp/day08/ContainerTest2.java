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
    }
}
