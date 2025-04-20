package com.example.demo;

public class App {

    // 简单的加法方法
    public int add(int a, int b) {
        return a + b;
    }

    // 主函数可选，用于手动测试
    public static void main(String[] args) {
        App calculator = new App();
        int result = calculator.add(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
