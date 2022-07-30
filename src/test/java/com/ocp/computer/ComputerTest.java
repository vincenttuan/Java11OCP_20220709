package com.ocp.computer;

public class ComputerTest {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        RAM ram = new RAM();
        SSD ssd = new SSD();
        Computer computer = new Computer();
        // 裝配
        computer.cpu = cpu;
        computer.ram = ram;
        computer.ssd = ssd;
        // 檢視電腦設備清單與價格
        System.out.printf("CPU speed: %.1f $%,d\n", computer.cpu.speed, computer.cpu.price);
        System.out.printf("RAM capacity: %,d $%,d\n", computer.ram.capacity, computer.ram.price);
        System.out.printf("SSD size: %,d $%,d\n", computer.ssd.size, computer.ssd.price);
        System.out.printf("Power: %dW $%,d\n", computer.power, computer.price);
        // total price
        int totalPrice = computer.cpu.price + computer.ram.price + computer.ssd.price + computer.price;
        System.out.printf("Total: $%,d\n", totalPrice);
    }
}
