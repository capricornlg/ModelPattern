package com.primeton.pattern.bridge;

/**
 * Created by Administrator on 16-4-3.
 */
public class Client {

    public static void main(String[] args) {
        Computer2 computer = new Laptop2(new Lenovo());
        computer.sale();
    }
}
