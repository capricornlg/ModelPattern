package com.primeton.pattern.decorator;

/**
 * Created by Administrator on 16-4-4.
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加新的功能，天上飞.....");

        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("增加新的功能，水上漂....");

        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("增加新功能。自动跑.....");

        AICar aiCar = new AICar(car);
        aiCar.move();
    }
}
