package com.primeton.pattern.decorator;

/**
 * IO中输入流和输出流的设计
 * Swing包中图形界面构建功能
 * Servlet api中提供了一个request对象的Decorator设计模式的默认实现类HttpServletRequestWrapper，HttpSevletRequestWrapper类，增强了request对象的功能。
 * Struts2中，request、response，session对象的处理
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

        System.out.println("*************************");

        WaterCar waterCar1 = new WaterCar(new AICar(car));
        waterCar1.move();
    }
}
